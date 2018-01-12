/**
 * 
 */
package com.idrivevs.services.net;

import java.security.SecureRandom;

/**
 * @author idirve
 * <p>
 * configuration options for the actual http requests
 * 
 */
public class EvsHttpClientSettings {
	
	/** The default timeout for creating new connections. */
    public static final int DEFAULT_CONNECTION_TIMEOUT = 10 * 1000;

    /** The default timeout for reading from a connected socket. */
    public static final int DEFAULT_SOCKET_TIMEOUT = 50 * 1000;

    /**
     * The default timeout for a request.
     */
    public static final int DEFAULT_REQUEST_TIMEOUT = 0;

    /** The default max connection pool size. */
    public static final int DEFAULT_MAX_CONNECTIONS = 50;
    
    /** The default securerandom instance. */
    private static final SecureRandom DEFAULT_SECURE_RANDOM = new SecureRandom();
    
    private int connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;
    
    private int socketTimeout = DEFAULT_SOCKET_TIMEOUT;
    
    private int requestTimeout = DEFAULT_REQUEST_TIMEOUT;
    
    private int maxConnections = DEFAULT_MAX_CONNECTIONS;
    
    private SecureRandom secureRandom = DEFAULT_SECURE_RANDOM;

	/**
	 * @return the connectionTimeout
	 */
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	/**
	 * @return the socketTimeout
	 */
	public int getSocketTimeout() {
		return socketTimeout;
	}

	/**
	 * @param socketTimeout the socketTimeout to set
	 */
	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	/**
	 * @return the requestTimeout
	 */
	public int getRequestTimeout() {
		return requestTimeout;
	}

	/**
	 * @param requestTimeout the requestTimeout to set
	 */
	public void setRequestTimeout(int requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	/**
	 * @return the maxConnections
	 */
	public int getMaxConnections() {
		return maxConnections;
	}

	/**
	 * @param maxConnections the maxConnections to set
	 */
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}

	/**
	 * @return the secureRandom
	 */
	public SecureRandom getSecureRandom() {
		return secureRandom;
	}

	/**
	 * @param secureRandom the secureRandom to set
	 */
	public void setSecureRandom(SecureRandom secureRandom) {
		this.secureRandom = secureRandom;
	}
    
    

}
