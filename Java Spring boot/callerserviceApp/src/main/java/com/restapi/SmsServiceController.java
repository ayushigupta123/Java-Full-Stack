package com.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SmsService1;
import com.model.SmsService2;

@RestController
public class SmsServiceController {
	
	ArrayList<SmsService1> arrayListservice1= new ArrayList();
	ArrayList<SmsService2> arrayListservice2= new ArrayList();
	
	public SmsServiceController()
	{
		arrayListservice1.add(new SmsService1("9087654321","2314567809","Hello from user"));
		arrayListservice1.add(new SmsService1("9806543217","9807123456","Welcome"));
		arrayListservice1.add(new SmsService1("0987654321","3456807924","Hey from pam"));
		arrayListservice1.add(new SmsService1("9807563412","9809765432","Hey from Sam"));
		
		arrayListservice2.add(new SmsService2("9087654321","2314567809","Hello from user","A"));
		arrayListservice2.add(new SmsService2("0987654321","3456807924","Hey from pam","B"));
		
	}
	
	//for url
	@GetMapping("/smsservice/v1")
	public List<SmsService1> getServiceDetails3()
	{
		return arrayListservice1;
	}
	
	@GetMapping("/smsservice/v2")
	public List<SmsService2> getServiceDetails4()
	{
		return arrayListservice2;
	}
	
	
	//for query parameter
	@GetMapping(value="/smsservice/param",params="version=1")
	public List<SmsService1> getServiceDetails1()
	{
		return arrayListservice1;
	}
	
	@GetMapping(value="/smsservice/param",params="version=2")
	public List<SmsService2> getServiceDetails()
	{
		return arrayListservice2;
	}
	
	
	
	
	//using headers api version
		@GetMapping(value="/smsservice/header",headers="X-API-VERSION=1")
		public List<SmsService1> getServiceDetails5()
		{
			return arrayListservice1;
		}
		
		@GetMapping(value="/smsservice/header",headers="X-API-VERSION=2")
		public List<SmsService2> getServiceDetails6()
		{
			return arrayListservice2;
		}
		
		//produce type sms service
		@GetMapping(value="/smsservice/",produces="application/sms.service.app-v1+json")
		public List<SmsService1> getServiceDetails7()
		{
			return arrayListservice1;
		}
		
		@GetMapping(value="/smsservice/",produces="application/sms.service.app-v2+json")
		public List<SmsService2> getServiceDetails8()
		{
			return arrayListservice2;
		}
	
	

}
