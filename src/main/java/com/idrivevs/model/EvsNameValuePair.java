/**
 * 
 */
package com.idrivevs.model;

/**
 * @author Manukm
 *
 */
public class EvsNameValuePair {
	
	private final String name;
	
	private final String value;

	public EvsNameValuePair(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}

}
