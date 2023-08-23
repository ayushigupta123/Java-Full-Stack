package com.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CallQualityDetailsV1;
import com.model.CallQualityDetailsV2;

@RestController
public class CallQualityController {
	
	ArrayList<CallQualityDetailsV1> arrayList1= new ArrayList();
	ArrayList<CallQualityDetailsV2> arrayList2= new ArrayList();
	
	public CallQualityController()
	{
		arrayList1.add(new CallQualityDetailsV1("Mobile V1","57","78","987"));
		
		arrayList2.add(new CallQualityDetailsV2("Mobile V2","34","65","145","Pune","Banglore"));
	}
	
	//using url
	 
		@GetMapping("/callqualitydetails/v1")
		public List<CallQualityDetailsV1> getCallDetails3()
		{
			return arrayList1;
		}

		@GetMapping("callqualitydetails/v2")
		public List<CallQualityDetailsV2> getCallDetails4()
		{
			return arrayList2;
		}
	
	//using request parameter
	@GetMapping(value="/callqualitydetails/param",params="version=1")
	public List<CallQualityDetailsV1> getCallDetails1()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callqualitydetails/param",params="version=2")
	public List<CallQualityDetailsV2> getCallDetails2()
	{
		return arrayList2;
	}

	
	//using header
	@GetMapping(value="/callqualitydetails",headers="X-API-VERSION=1")
	public List<CallQualityDetailsV1> getCallDetails5()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callqualitydetails",headers="X-API-VERSION=2")
	public List<CallQualityDetailsV2> getCallDetails6()
	{
		return arrayList2;
	}
	
	//using produces
	@GetMapping(value="/callqualitydetails",produces="application/sms.service.app-v1+json")
	public List<CallQualityDetailsV1> getCallDetails7()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callqualitydetails",produces="application/sms.service.app-v2+json")
	public List<CallQualityDetailsV2> getCallDetails8()
	{
		return arrayList2;
	}
	
	
	
	
	

}
