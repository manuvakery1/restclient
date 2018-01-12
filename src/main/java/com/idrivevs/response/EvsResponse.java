/**
 * 
 */
package com.idrivevs.response;

import java.io.Serializable;
import java.util.Map;

/**
 * @author idrive
 * 
 */
public class EvsResponse<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	private String desc;
	private String configstatus;
	private Map<String,String> responseHeader;
	private T result;
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	/**
	 * @return the configstatus
	 */
	public String getConfigstatus() {
		return configstatus;
	}
	/**
	 * @param configstatus the configstatus to set
	 */
	public void setConfigstatus(String configstatus) {
		this.configstatus = configstatus;
	}
	/**
	 * @return the responseHeader
	 */
	public Map<String, String> getResponseHeader() {
		return responseHeader;
	}
	/**
	 * @param responseHeader the responseHeader to set
	 */
	public void setResponseHeader(Map<String, String> responseHeader) {
		this.responseHeader = responseHeader;
	}
	/**
	 * @return the result
	 */
	public T getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(T result) {
		this.result = result;
	}
	
	
	
	
	
}
