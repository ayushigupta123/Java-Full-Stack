package com.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.model.ServicePolicies1;
import com.model.ServicePolicies2;

@RestController
public class ServicePoliciesController {
	
	ArrayList<ServicePolicies1> arrayList1= new ArrayList();
	ArrayList<ServicePolicies2> arrayList2= new ArrayList();
	
	public ServicePoliciesController()
	{
		arrayList1.add(new ServicePolicies1("1st","LIC","13/14/2000","Pune","500000"));
		
		arrayList2.add(new ServicePolicies2("2nd","HDFC","23/09/2005","Mumbai","1000000","80C","SMS"));
	}
	
	@GetMapping("/servicepolicies/v1")
	public List<ServicePolicies1> getPoliciesDetails5()
	{
		return arrayList1;
	}
	
	@GetMapping("/servicepolicies/v2")
	public List<ServicePolicies2> getPoliciesDetails6()
	{
		return arrayList2;
	}
	 
	@GetMapping(value="/servicepolicies",headers="X-API-VERSION=1")
	public List<ServicePolicies1> getPoliciesDetails1()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/servicepolicies",headers="X-API-VERSION=2")
	public List<ServicePolicies2> getPoliciesDetails2()
	{
		return arrayList2;
	} 
	
	@GetMapping(value="/servicepolicies",produces="application/sms.policies.app-v1+json")
	public List<ServicePolicies1> getPoliciesDetails3()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/servicepolicies",produces="application/sms.policies.app-v2+json")
	public List<ServicePolicies2> getPoliciesDetails4()
	{
		return arrayList2;
	}
	 


}
