package com.mybean;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ServicePlan {
	
	private String planName;
	private String validityDays;
	private String price;
	
	@Resource
	//@Qualifier(myDbInfi1)
	private MyDbInfo myDbInfo;
	
	
	public ServicePlan() {
		super();
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}


	public String getValidityDays() {
		return validityDays;
	}


	public void setValidityDays(String validityDays) {
		this.validityDays = validityDays;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public MyDbInfo getMyDbInfo() {
		return myDbInfo;
	}


	public void setMyDbInfo(MyDbInfo myDbInfo) {
		this.myDbInfo = myDbInfo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServicePlan [planName=");
		builder.append(planName);
		builder.append(", validityDays=");
		builder.append(validityDays);
		builder.append(", price=");
		builder.append(price);
		builder.append(", myDbInfo=");
		builder.append(myDbInfo);
		builder.append("]");
		return builder.toString();
	}


	public ServicePlan(String planName, String validityDays, String price, MyDbInfo myDbInfo) {
		super();
		this.planName = planName;
		this.validityDays = validityDays;
		this.price = price;
		this.myDbInfo = myDbInfo;
	}


	@PostConstruct
	public void beancreated() {
		System.out.println("bean created");
	}
	
	@PreDestroy
	public void beandestroyed() {
		System.out.println("bean destroyed");
	}
}
