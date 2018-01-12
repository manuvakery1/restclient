/**
 * 
 */
package com.idrivevs.exception;

/**
 * @author idirve
 *
 */
public class EvsServiceException extends EvsClientException {

	/**
	 * 
	 *
	 */
	public enum ExceptionType{
		Client,
		Server,
		UnKnown
	}
	
	private int httpStatusCode;
	
	private String errorMessage;
	
	private String errorCode;
	
	private ExceptionType exceptionRoot = ExceptionType.UnKnown;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6123875168025150099L;
	
	
	 
	/**
	 * 
	 * @param message
	 * @param throwable
	 */
	public EvsServiceException(String message, Throwable throwable){
		super(message, throwable);
		this.errorMessage = message;
	}
	
	/**
	 * 
	 * @param message
	 */
	public EvsServiceException(String message){
		super(message);
		this.errorMessage = message;
	}
	
	/**
	 * 
	 * @param throwable
	 */
	public EvsServiceException(Throwable throwable){
		super(throwable);
	}

	/**
	 * @return the httpStatusCode
	 */
	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	/**
	 * @param httpStatusCode the httpStatusCode to set
	 */
	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the exceptionRoot
	 */
	public ExceptionType getExceptionRoot() {
		return exceptionRoot;
	}

	/**
	 * @param exceptionRoot the exceptionRoot to set
	 */
	public void setExceptionRoot(ExceptionType exceptionRoot) {
		this.exceptionRoot = exceptionRoot;
	}
	
	

}
