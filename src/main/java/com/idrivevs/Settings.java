package com.idrivevs;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Settings {
	
	private String settingsName;
	@XStreamAsAttribute
	private int id;
	@XStreamAsAttribute
	private String type;
	@XStreamAsAttribute
	private String value;
	@XStreamAsAttribute
	private String bksetname;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the bksetname
	 */
	public String getBksetname() {
		return bksetname;
	}
	/**
	 * @param bksetname the bksetname to set
	 */
	public void setBksetname(String bksetname) {
		this.bksetname = bksetname;
	}
	/**
	 * @return the settingsName
	 */
	public String getSettingsName() {
		return settingsName;
	}
	/**
	 * @param settingsName the settingsName to set
	 */
	public void setSettingsName(String settingsName) {
		this.settingsName = settingsName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Settings [settingsName=" + settingsName + ", id=" + id + ", type=" + type + ", value=" + value
				+ ", bksetname=" + bksetname + "]";
	}
	
	
	
	
	

}
