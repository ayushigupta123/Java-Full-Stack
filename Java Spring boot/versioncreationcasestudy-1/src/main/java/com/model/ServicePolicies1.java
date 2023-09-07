package com.model;

public class ServicePolicies1 {

	private String policyVersion;
	private String name;
	private String policyEffectiveDate;
	private String policyEffectiveLocation;
	private String serviceCharges;
	
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
	public ServicePolicies1(String policyVersion, String name, String policyEffectiveDate,
			String policyEffectiveLocation, String serviceCharges) {
		super();
		this.policyVersion = policyVersion;
		this.name = name;
		this.policyEffectiveDate = policyEffectiveDate;
		this.policyEffectiveLocation = policyEffectiveLocation;
		this.serviceCharges = serviceCharges;
	}
	@Override
	public String toString() {
		return "ServicePolicies1 [policyVersion=" + policyVersion + ", name=" + name + ", policyEffectiveDate="
				+ policyEffectiveDate + ", policyEffectiveLocation=" + policyEffectiveLocation + ", serviceCharges="
				+ serviceCharges + "]";
	}
	public ServicePolicies1() {
		super();
	}
	
	
	
}
