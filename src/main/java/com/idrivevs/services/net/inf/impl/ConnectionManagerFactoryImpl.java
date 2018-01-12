/**
 * 
 */
package com.idrivevs.services.net.inf.impl;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLInitializationException;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;

import com.idrivevs.services.net.EvsHttpClientSettings;
import com.idrivevs.services.net.inf.ConnectionManagerFactory;

/**
 * @author idrive
 * 
 * <p>
 * factory implementation for apache HttpClientConnectionManager
 *
 * <p>
 *  PoolingHttpClientConnectionManager is a more complex implementation
 *  that manages a pool of client connections and is able to service connection
 *  requests from multiple execution threads. Connections are pooled on a per route basis.
 *  A request for a route for which the manager already has a persistent connection available 
 *  in the pool will be serviced by leasing a connection from the pool rather than creating a brand new connection.
 */
public class ConnectionManagerFactoryImpl implements ConnectionManagerFactory {

	@SuppressWarnings("deprecation")
	@Override
	public HttpClientConnectionManager getConnectionManger(EvsHttpClientSettings settings) {
		SSLContext sslContext;
		try {
			sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build();
			SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
		    Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create().register("https", socketFactory).build();
		    final PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry); 
			connectionManager.setMaxTotal(settings.getMaxConnections());
			connectionManager.setDefaultMaxPerRoute(settings.getMaxConnections()); 
		    return connectionManager;
		} catch (KeyManagementException e) {
			throw new SSLInitializationException(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			throw new SSLInitializationException(e.getMessage(), e);
		} catch (KeyStoreException e) {
			throw new SSLInitializationException(e.getMessage(), e);
		}
	    
	}

}
