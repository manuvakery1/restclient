/**
 * 
 */
package com.idrivevs.services;

import java.util.Map;

import com.idrivevs.exception.EvsServiceException;
import com.idrivevs.response.EvsResponse;

/**
 * @author idrive
 * <p>
 * this class provide a default implementation for {@link EvsService}
 * users can extend this class instead of {@link EvsService} , 
 * so that introducing new method to EvsService will not break the clients   
 * <p>
 *  
 */
public abstract class AbstractEvsService implements EvsService {

	/* (non-Javadoc)
	 * @see com.idrivevs.services.EvsService#getServerAddress(java.util.Map)
	 */
	public EvsResponse getServerAddress(Map<String, String> params) throws EvsServiceException {
		throw new UnsupportedOperationException("Extend AbstractEvsService to provide an implementation");
	}

	/* (non-Javadoc)
	 * @see com.idrivevs.services.EvsService#valdateAccount(java.util.Map)
	 */
	public EvsResponse validateAccount(Map<String, String> params) throws EvsServiceException {
		throw new UnsupportedOperationException("Extend AbstractEvsService to provide an implementation");
	}

}
