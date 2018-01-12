/**
 * 
 */
package com.idrivevs.model;

import java.io.Serializable;

/**
 * @author Manukm
 *
 */
public class EvsCredentials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * idrive username
	 */
	private String username;
	/**
	 * idrive password
	 */
	private String password;
	/**
	 * idirve private encryption key
	 */
	private String privateEncKey;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the privateEncKey
	 */
	public String getPrivateEncKey() {
		return privateEncKey;
	}
	/**
	 * @param privateEncKey the privateEncKey to set
	 */
	public void setPrivateEncKey(String privateEncKey) {
		this.privateEncKey = privateEncKey;
	}
	
	

	

}
