/**
 * 
 */
package com.idrivevs.services.net.inf;

import org.apache.http.impl.client.CloseableHttpClient;

import com.idrivevs.services.net.EvsHttpClientSettings;

/**
 * @author idirve
 * <p>
 * factory interface to get the http client instance
 */
public interface HttpClientFactory {
	/**
	 * 
	 * @param settings
	 * @return
	 */
	CloseableHttpClient getHttpClient(EvsHttpClientSettings settings);
}
