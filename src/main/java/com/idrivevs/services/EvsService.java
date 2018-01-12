/**
 * 
 */
package com.idrivevs.services;

import java.util.Map;

import com.idrivevs.exception.EvsServiceException;
import com.idrivevs.request.UploadFileChunkRequest;
import com.idrivevs.response.EvsResponse;

/**
 * @author idrive
 * <p>
 * Provides an interface for accessing the idrive evs rest services
 * 
 * <p>
 * The Idrive evs Java SDK provides a simple interface that can be used to store
 * and retrieve any amount of data, at any time, from anywhere on the web. 
 * 
 * <p>
 * For more information about Idrive Evs, please see <a
 * href="https://www.publicapis.com/idrive-evs/idrive-evs">Idrive Evs</a>
 */
public interface EvsService {
	
	/**
	 * 
	 * @param params
	 * @return
	 * @throws EvsServiceException
	 */
	public EvsResponse getServerAddress(Map<String, String> params) throws EvsServiceException;
	
	/**
	 * 
	 * @param params
	 * @return
	 * @throws EvsServiceException
	 */
	public EvsResponse validateAccount(Map<String, String> params) throws EvsServiceException;
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws EvsServiceException
	 */
	public EvsResponse uploadFileChunk(UploadFileChunkRequest request) throws EvsServiceException;
	

}
