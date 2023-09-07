package com.model;

public class ServicePolicies2 {
	
	private String policyVersion;
	private String name;
	private String policyEffectiveDate;
	private String policyEffectiveLocation;
	private String serviceCharges;
	private String exemption;
	private String claimNotifications;
	
	
	public String getPolicyVersion() {
		return policyVersion;
	}
	public void setPolicyVersion(String policyVersion) {
		this.policyVersion = policyVersion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(String policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public String getPolicyEffectiveLocation() {
		return policyEffectiveLocation;
	}
	public void setPolicyEffectiveLocation(String policyEffectiveLocation) {
		this.policyEffectiveLocation = policyEffectiveLocation;
	}
	public String getServiceCharges() {
		return serviceCharges;
	}
	public void setServiceCharges(String serviceCharges) {
		this.serviceCharges = serviceCharges;
	}
	public String getExemption() {
		return exemption;
	}
	public void setExemption(String exemption) {
		this.exemption = exemption;
	}
	public String getClaimNotifications() {
		return claimNotifications;
	}
	public void setClaimNotifications(String claimNotifications) {
		this.claimNotifications = claimNotifications;
	}
	public ServicePolicies2(String policyVersion, String name, String policyEffectiveDate,
			String policyEffectiveLocation, String serviceCharges, String exemption, String claimNotifications) {
		super();
		this.policyVersion = policyVersion;
		this.name = name;
		this.policyEffectiveDate = policyEffectiveDate;
		this.policyEffectiveLocation = policyEffectiveLocation;
		this.serviceCharges = serviceCharges;
		this.exemption = exemption;
		this.claimNotifications = claimNotifications;
	}
	@Override
	public String toString() {
		return "ServicePolicies2 [policyVersion=" + policyVersion + ", name=" + name + ", policyEffectiveDate="
				+ policyEffectiveDate + ", policyEffectiveLocation=" + policyEffectiveLocation + ", serviceCharges="
				+ serviceCharges + ", exemption=" + exemption + ", claimNotifications=" + claimNotifications + "]";
	}
	public ServicePolicies2() {
		super();
	}
	
	

}
