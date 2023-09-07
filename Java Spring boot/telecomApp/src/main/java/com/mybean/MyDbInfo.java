package com.mybean;

public class MyDbInfo {
	
	private String myDbInfo;
	
	

	public MyDbInfo() {
		super();
	}

	public String getMyDbInfo() {
		return myDbInfo;
	}

	public void setMyDbInfo(String myDbInfo) {
		this.myDbInfo = myDbInfo;
	}

	public MyDbInfo(String myDbInfo) {
		super();
		this.myDbInfo = myDbInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyDbInfo [myDbInfo=");
		builder.append(myDbInfo);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
