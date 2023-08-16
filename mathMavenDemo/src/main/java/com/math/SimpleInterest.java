package com.math;

public class SimpleInterest {

	private int principle;
	private int year;
	private int rate;
	
	
	public void simpleInterest(int principle,int rate,int year) {
		
		
		this.principle=principle;
		this.rate=rate;
		this.year=year;
	}
	
	public double calc() {
		
		
		
		return principle*rate*year/100;
		
	}
	

	

}
