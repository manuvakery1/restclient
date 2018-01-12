/**
 * 
 */
package com.idrivevs.services.net;

import com.idrivevs.exception.EvsServiceException;
import com.idrivevs.request.EvsRequest;
import com.idrivevs.response.EvsResponse;

/**
 * @author Manukm
 *
 */
public interface EvsResponseGetter<T extends EvsRequest, R extends EvsResponse> {
	
	public R request(T t) throws EvsServiceException;

}
