/**
 * 
 */
package com.idrivevs.exception;

/**
 * @author idirve
 * <p>
 *  Base exception class for any errors that occur while attempting to use
 *  evs rest services using the evs java SDK.
 * <p>
 * Error responses from services will be handled as EvsServiceExceptions. 
 * This class is primarily for errors that occur when unable to get a response
 * from a service, or when the client is unable to parse the response from a
 * service. For example, if a caller tries to use a client to make a service
 * call, but no network connection is present, an EvsClientException will be
 * thrown to indicate that the client wasn't able to successfully make the
 * service call, and no information from the service is available.
 * <p>
 * Note : If the SDK is able to parse the response; but doesn't recognize the 
 * error code from the service, an EvsServiceException is thrown
 * <p>
 * Callers should typically deal with exceptions through EvsServiceException,
 * which represent error responses returned by services. EvsServiceException
 * has much more information available for callers to appropriately deal with
 * different types of errors that can occur.
 * <p>
 * 
 * @see EvsServiceException
 */
public class EvsClientException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7119575005905653010L;
	
	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public EvsClientException(String message, Throwable throwable){
		super(message, throwable);
	}
	
	/**
	 * 
	 * @param message
	 */
	public EvsClientException(String message){
		super(message);
	}
	
	/**
	 * 
	 * @param throwable
	 */
	public EvsClientException(Throwable throwable){
		super(throwable);
	}
	
	

}
