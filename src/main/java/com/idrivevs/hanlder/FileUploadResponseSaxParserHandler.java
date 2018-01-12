/**
 * 
 */
package com.idrivevs.hanlder;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.idrivevs.response.EvsResponse;
import com.idrivevs.response.FileUploadResponse;

/**
 * @author Manukm
 *
 */
public class FileUploadResponseSaxParserHandler extends AbstarctEvsSaxParserHandler<FileUploadResponse> {
	
	private EvsResponse<FileUploadResponse> response = new EvsResponse<FileUploadResponse>();
	private FileUploadResponse fileUploadResponse;
	
	@Override
	public EvsResponse<FileUploadResponse> getResponse() {
		return response;
	}
	
	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals(EvsResponseFields.XML_ITEM)){
			response.setResult(fileUploadResponse);
		}
	}

	/* (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals(EvsResponseFields.XML_ROOT)){
			String msg = attributes.getValue(EvsResponseFields.MESSAGE);
			response.setMessage(msg);
			if(msg.equals(EvsResponseFields.ERROR_MSG)){
				response.setDesc(attributes.getValue(EvsResponseFields.DESC));
				response.setConfigstatus(attributes.getValue(EvsResponseFields.CONFIG_STATUS));
			}
		}else if(qName.equals(EvsResponseFields.XML_ITEM)){
			fileUploadResponse = new FileUploadResponse();
			String filename = attributes.getValue(EvsResponseFields.FileUploadAttributes.FILE_NAME);
			fileUploadResponse.setFilename(filename);
			String filesize = attributes.getValue(EvsResponseFields.FileUploadAttributes.FILE_SIZE);
			fileUploadResponse.setFilesize(filesize);
			String lastModified = attributes.getValue(EvsResponseFields.FileUploadAttributes.LAST_MODIFIED);
			fileUploadResponse.setLastModified(lastModified);
		}
	}

	

}
