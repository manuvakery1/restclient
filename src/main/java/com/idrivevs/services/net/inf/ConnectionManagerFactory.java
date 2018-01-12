/**
 * 
 */
package com.idrivevs.services.net.inf;

import org.apache.http.conn.HttpClientConnectionManager;

import com.idrivevs.services.net.EvsHttpClientSettings;

/**
 * @author Manukm
 * <p>
 * Factory interface for apache 
 */
public interface ConnectionManagerFactory {
	
	/**
	 * 
	 * @param settings
	 * @return 
	 */
	public HttpClientConnectionManager getConnectionManger(EvsHttpClientSettings settings);
}
