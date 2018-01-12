/**
 * 
 */
package com.idrivevs.services.net.inf.impl;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;

import com.idrivevs.services.net.EvsHttpClientSettings;
import com.idrivevs.services.net.inf.ConnectionManagerFactory;
import com.idrivevs.services.net.inf.HttpClientFactory;

/**
 * @author idrive
 *
 */
public class HttpClientFactoryImpl implements HttpClientFactory {
	
	
	private final ConnectionManagerFactory connectionManagerFactory = new ConnectionManagerFactoryImpl();

	/* (non-Javadoc)
	 * @see com.idrivevs.services.net.inf.HttpClientFactory#getHttpClient(com.idrivevs.services.net.EvsHttpClientSettings)
	 */
	@Override
	public CloseableHttpClient getHttpClient(EvsHttpClientSettings settings) {
		 return HttpClients.custom().setRequestExecutor(new HttpRequestExecutor())
         .setKeepAliveStrategy(new ConnectionKeepAliveStrategy() {
			@Override
			public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
				return DefaultConnectionKeepAliveStrategy.INSTANCE
		                .getKeepAliveDuration(response, context);
			}
         })
         .disableRedirectHandling()
         .disableAutomaticRetries()
         .setConnectionManager(connectionManagerFactory.getConnectionManger(settings))
         .disableContentCompression().build();
	}

}
