/**
 * 
 */
package com.idrivevs.hanlder;

import org.xml.sax.helpers.DefaultHandler;

import com.idrivevs.response.EvsResponse;

/**
 * @author Manukm
 *
 */
public abstract class AbstarctEvsSaxParserHandler<T> extends DefaultHandler {
	
	/**
	 * 
	 * @return
	 */
	public abstract EvsResponse<T> getResponse();
	
	/**
	 * 
	 * @author Manukm
	 *
	 */
	public interface EvsResponseFields{
		public static final String ERROR_MSG = "ERROR";
		public static final String SUCCESS_MSG = "SUCCESS";
		public static final String MESSAGE = "message";
		public static final String DESC = "desc";
		public static final String CONFIG_STATUS = "configstatus";
		public static final String XML_ROOT = "tree";
		public static final String XML_ITEM = "item";
		
		/**
		 * 
		 * @author Manukm
		 *
		 */
		public static interface FileUploadAttributes{
			public static final String UPLOAD_STATUS  = "uploadstatus";
			public static final String FILE_NAME = "filename";
			public static final String FILE_SIZE = "filesize";
			public static final String LAST_MODIFIED = "lmd";
		}
		
		
	}

	

}
