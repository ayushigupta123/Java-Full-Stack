package com.model;

public class Developer {
	
	private String developername;
	private String platformUsed; 
	private String serverUsed;
	private String app_life_cycle_status;
	
	public String getDevelopername() {
		return developername;
	}
	public void setDevelopername(String developername) {
		this.developername = developername;
	}
	public String getPlatformUsed() {
		return platformUsed;
	}
	public void setPlatformUsed(String platformUsed) {
		this.platformUsed = platformUsed;
	}
	public String getServerUsed() {
		return serverUsed;
	}
	public void setServerUsed(String serverUsed) {
		this.serverUsed = serverUsed;
	}
	public String getApp_life_cycle_status() {
		return app_life_cycle_status;
	}
	public void setApp_life_cycle_status(String app_life_cycle_status) {
		this.app_life_cycle_status = app_life_cycle_status;
	}
	@Override
	public String toString() {
		return "Developer [developername=" + developername + ", platformUsed=" + platformUsed + ", serverUsed="
				+ serverUsed + ", app_life_cycle_status=" + app_life_cycle_status + "]";
	}
	public Developer(String developername, String platformUsed, String serverUsed, String app_life_cycle_status) {
		super();
		this.developername = developername;
		this.platformUsed = platformUsed;
		this.serverUsed = serverUsed;
		this.app_life_cycle_status = app_life_cycle_status;
	}
	public Developer() {
		super();
	}
	
	

}
