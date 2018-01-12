package com.idrivevs;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("User")
public class User {
	
	@XStreamAsAttribute
	private String id;
	@XStreamImplicit
	private List<Settings> settings = new ArrayList<Settings>();
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the settings
	 */
	public List<Settings> getSettings() {
		return settings;
	}
	/**
	 * @param settings the settings to set
	 */
	public void setSettings(List<Settings> settings) {
		this.settings = settings;
	}
	
	public void addSetting(Settings setting){
		settings.add(setting);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
