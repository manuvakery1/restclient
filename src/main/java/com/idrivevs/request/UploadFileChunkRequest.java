/**
 * 
 */
package com.idrivevs.request;

import java.io.File;
import java.io.InputStream;

/**
 * @author Manukm
 *
 */
public class UploadFileChunkRequest extends EvsRequest<UploadFileChunkRequest> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private File file;
	
	private int chunkId;
	
	private long chunkSize;
	
	private String requestId;
	
	private int fileOffset;
	
	private InputStream is;

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}
	
	/**
	 * @return the chunkId
	 */
	public int getChunkId() {
		return chunkId;
	}

	/**
	 * @param chunkId the chunkId to set
	 */
	public void setChunkId(int chunkId) {
		this.chunkId = chunkId;
	}

	/**
	 * @return the chunkSize
	 */
	public long getChunkSize() {
		return chunkSize;
	}

	/**
	 * @param chunkSize the chunkSize to set
	 */
	public void setChunkSize(long chunkSize) {
		this.chunkSize = chunkSize;
	}

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	
	
	
	/**
	 * @return the fileOffset
	 */
	public long getFileOffset() {
		return fileOffset;
	}

	/**
	 * @param fileOffset the fileOffset to set
	 */
	public void setFileOffset(int fileOffset) {
		this.fileOffset = fileOffset;
	}

	/**
	 * Sets the file containing the data to upload, and returns this updated
     * UploadFileChunkRequest object so that additional method calls can be chained
     * together.
     * 
	 * @param file containing the data to upload
	 * @return
	 */
	public UploadFileChunkRequest withFile(File file){
		setFile(file);
		return this;
	}
	/**
	 * Sets the request id which is received from the initiate chunk file upload request,and returns this updated
     * UploadFileChunkRequest object so that additional method calls can be chained
     * together.
	 * 
	 * @param requestId
	 * @return
	 */
	public UploadFileChunkRequest withRequestId(String requestId){
		setRequestId(requestId);
		return this;
	}
	
	/**
	 * specifies the starting point of the file chunk ,and returns this updated
     * UploadFileChunkRequest object so that additional method calls can be chained
     * together.
	 * 
	 * @param fileOffset
	 * @return
	 */
	public UploadFileChunkRequest withOffset(int fileOffset){
		setFileOffset(fileOffset);
		return this;
	}
	
	/**
	 * specifies length of each file chunk ,and returns this updated
     * UploadFileChunkRequest object so that additional method calls can be chained
     * together.
	 * @param checkSize
	 * @return
	 */
	public UploadFileChunkRequest withChunkSize(long checkSize){
		setChunkSize(checkSize);
		return this;
	}
	
	
	
	
	/**
	 * @return the is
	 */
	public InputStream getIs() {
		return is;
	}

	/**
	 * @param is the is to set
	 */
	public void setIs(InputStream is) {
		this.is = is;
	}

	@Override
	public InputStream getOriginalRequest() {
		// TODO Auto-generated method stub
		return getIs();
	}

}
