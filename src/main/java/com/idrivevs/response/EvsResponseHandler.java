/**
 * 
 */
package com.idrivevs.response;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.ContentType;
import org.xml.sax.SAXException;

import com.idrivevs.hanlder.AbstarctEvsSaxParserHandler;

/**
 * @author Manukm
 *
 */
public class EvsResponseHandler<T> implements ResponseHandler<EvsResponse<T>> {
	
	private static final SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	private SAXParser parser;
	private AbstarctEvsSaxParserHandler<T> defaultHandler;
	
	
	/**
	 * 
	 */
	public EvsResponseHandler(AbstarctEvsSaxParserHandler<T> defaultHandler)throws ParserConfigurationException, SAXException {
		this.parser = saxParserFactory.newSAXParser();
		this.defaultHandler = defaultHandler;
	}

	@Override
	public EvsResponse<T> handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

		StatusLine statusLine = response.getStatusLine();
		HttpEntity entity = response.getEntity();
		if (statusLine.getStatusCode() >= 300) {
			throw new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase());
		}
		if (entity == null) {
			throw new ClientProtocolException("Response contains no content");
		}
			ContentType contentType = ContentType.getOrDefault(entity);
			if (!contentType.getMimeType().equals(ContentType.APPLICATION_XML.getMimeType())) {
				throw new ClientProtocolException("Unexpected content type:" + contentType);
			}
			try {
				parser.parse(entity.getContent(), defaultHandler);
				return defaultHandler.getResponse(); 
			} catch (UnsupportedOperationException e) {
				throw new IOException(e.getMessage());
			} catch (SAXException e) {
				throw new IOException(e.getMessage());
			}
	}

	
}
