/**
 * 
 */
package com.idrivevs.request;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.idrivevs.model.EvsCredentials;
import com.idrivevs.model.EvsNameValuePair;

/**
 * @author idirve
 * <p>
 * base class which is extended by all evs resource specific request object
 */
public abstract class EvsRequest<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2987013587764018987L;
	
	/**
	 * 
	 */
	private Map<String, String> requestheaders;
	
	/**
	 * 
	 */
	private EvsCredentials credentials;
	
	private List<EvsNameValuePair> formData;
	
	
	/**
	 * @return the requestheaders
	 */
	public Map<String, String> getRequestheaders() {
		return requestheaders;
	}

	/**
	 * @param requestheaders the requestheaders to set
	 */
	public void setRequestheaders(Map<String, String> requestheaders) {
		this.requestheaders = requestheaders;
	}

	/**
	 * @return the credentials
	 */
	public EvsCredentials getCredentials() {
		return credentials;
	}

	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(EvsCredentials credentials) {
		this.credentials = credentials;
	}

	

	/**
	 * @return the formData
	 */
	public List<EvsNameValuePair> getFormData() {
		return formData;
	}

	/**
	 * @param formData the formData to set
	 */
	public void setFormData(List<EvsNameValuePair> formData) {
		this.formData = formData;
	}

	/**
	 * 
	 * @return
	 */
	public abstract InputStream getOriginalRequest();
	
	
	
	

}
