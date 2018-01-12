/**
 * 
 */
package com.idrivevs.response;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author idrive
 * <p>
 *  This holds the response of an evs standard request. 
 */
public class FileUploadResponse implements Serializable {
	
	
	public static void main(String[] args) {
		int[] in = new int[] {2,3, 4 , 6, 10, 12};
		int[] joinPipes = joinPipes(in);
		System.out.println(Arrays.toString(joinPipes));
		
	}
	
	
	
	static int[] joinPipes(int[] pipes) {
		int[] result = new int[pipes.length];
		Arrays.sort(pipes);
		int curindex = 0;
		int lastjoinPipelength = 0;
		int arrayIndex = 0;
		while(curindex<pipes.length) {
			int p1 = pipes[curindex];
			int p2 = lastjoinPipelength;
			if(curindex+1 < pipes.length) {
				p2 = pipes[curindex+1];
				if(lastjoinPipelength == 0) {
					curindex += 2;
					result[arrayIndex++] = p1;
					result[arrayIndex++] = p2;
				}else if(lastjoinPipelength < p1 || lastjoinPipelength < p2){
					p2 = lastjoinPipelength;
					result[arrayIndex++] = p1;
					result[arrayIndex++] = p2;
					curindex++;
				}else {
					curindex += 2;
				}
				lastjoinPipelength = p1+p2;
			}else {
				curindex++;
				result[arrayIndex++] = p1;
			}
		}
		return result;
	}
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2681493025694832776L;
	
	private String filename;
	private String uploadstatus;
	private String lastModified;
	private String filesize;
	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}
	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * @return the uploadstatus
	 */
	public String getUploadstatus() {
		return uploadstatus;
	}
	/**
	 * @param uploadstatus the uploadstatus to set
	 */
	public void setUploadstatus(String uploadstatus) {
		this.uploadstatus = uploadstatus;
	}
	/**
	 * @return the lastModified
	 */
	public String getLastModified() {
		return lastModified;
	}
	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	/**
	 * @return the filesize
	 */
	public String getFilesize() {
		return filesize;
	}
	/**
	 * @param filesize the filesize to set
	 */
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	
	
	
	
	

}
