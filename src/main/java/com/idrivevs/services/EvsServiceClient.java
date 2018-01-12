/**
 * 
 */
package com.idrivevs.services;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import com.idrivevs.exception.EvsServiceException;
import com.idrivevs.request.UploadFileChunkRequest;
import com.idrivevs.response.EvsResponse;

/**
 * @author idrive
 * <p>
 *  Acting as a client to access evs rest services 
 *  <p>
 * For more information about Idrive Evs, please see <a
 * href="https://www.publicapis.com/idrive-evs/idrive-evs">Idrive Evs</a>
 */
public class EvsServiceClient extends EvsServiceBase implements EvsService {
	
	/*
	 * (non-Javadoc)
	 * @see com.idrivevs.services.AbstractEvsService#getServerAddress(java.util.Map)
	 */
	@Override
	public EvsResponse getServerAddress(Map<String, String> params) throws EvsServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.idrivevs.services.EvsService#validateAccount(java.util.Map)
	 */
	@Override
	public EvsResponse validateAccount(Map<String, String> params) throws EvsServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.idrivevs.services.EvsService#uploadFileChunk(com.idrivevs.request.UploadFileChunkRequest)
	 */
	@Override
	public EvsResponse uploadFileChunk(UploadFileChunkRequest request) throws EvsServiceException {
		File originalFile = request.getFile();
		InputStream originalInputStream = null; 
		int chunkId = request.getChunkId();
		long chunkSize = request.getChunkSize();
		long fileOffset = request.getFileOffset();
		String requestId = request.getRequestId();
		
		request(request);
		
		
		
		return null;
	}
	
   
}
