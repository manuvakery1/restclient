/**
 * 
 */
package com.idrivevs.services;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.idrivevs.exception.EvsClientException;
import com.idrivevs.exception.EvsServiceException;
import com.idrivevs.request.EvsRequest;
import com.idrivevs.response.EvsResponse;



/**
 * @author Manukm
 *
 */
public abstract class EvsServiceBase {

	public static final String CHARSET = "UTF-8";
	private static final String LIVE_API_BASE = "https://evs.idrive.com";
	
	
	/**
	 * each classname identifies a unique idrive evs resource 
	 * @param clazz
	 * @return
	 */
	private static String resourceName(Class<?> clazz) {
		String className = clazz.getSimpleName().toLowerCase().replace("$", " ");
		if (className.equals("fileupload")) {
			return "uploadFile";
		}else if (className.equals("serveraddress")) {
			return "getServerAddress";
		}else if (className.equals("validateaccount")) {
			return "validateAccount ";
		}else {
			return className;
		}
	}
	
	/**
	 * 
	 * @param clazz
	 * @return
	 */
	protected static String resourceURL(Class<?> clazz) {
		return buildResourceURL(clazz, LIVE_API_BASE);
	}
	
	/**
	 * 
	 * @param clazz
	 * @param webApiServer
	 * @return
	 */
	protected static String resourceURL(Class<?> clazz, String webApiServer) {
		return buildResourceURL(clazz, String.format("https://%s", webApiServer));
	}
	
	/**
	 * 
	 * @param clazz
	 * @param apiBase
	 * @return
	 */
	private static String buildResourceURL(Class<?> clazz, String apiBase) {
		return String.format("%s/evs/%s", apiBase, resourceName(clazz));
	}
	
	


	/**
	 * 
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	protected static String urlEncode(String str) throws UnsupportedEncodingException {
		if (str == null) {
			return null;
		} else {
			return URLEncoder.encode(str, CHARSET);
		}
	}
	
	/**
	 * 
	 * @param method
	 * @param url
	 * @param params
	 * @param clazz
	 * @param inputStream
	 * @return
	 * @throws EvsClientException
	 * @throws EvsServiceException
	 */
	protected static <T, R> EvsResponse<R> request(EvsRequest<T> request) throws EvsClientException, EvsServiceException {
		InputStream originalRequest = request.getOriginalRequest();
		
		return null;
	}
	
	

}
