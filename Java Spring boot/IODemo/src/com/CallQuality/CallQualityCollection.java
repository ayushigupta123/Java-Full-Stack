package com.CallQuality;

import java.io.*;

public class CallQualityCollection {
	
	public void saveCallQuality(CallQuality callQuality) {
		try {
			
			FileOutputStream fout = new FileOutputStream(callQuality.getCallId()+".dat");
			ObjectOutputStream objectout = new ObjectOutputStream(fout);
			objectout.writeObject(callQuality);
			objectout.flush();
			objectout.close();
			
			
		}
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		catch(IOException ex) {
			System.out.print(ex);
		}
	}
	
	public void showCallQuality(int callId) {
		try {
			
			FileInputStream fin = new FileInputStream(callId+".dat");
			ObjectInputStream objectin = new ObjectInputStream(fin);
			CallQuality callQuality =(CallQuality)objectin.readObject();
			
			System.out.println("CallId: "+callQuality.getCallId());
			System.out.println("Call Duration: "+callQuality.getCallDuration());
			System.out.println("Call Quality Grade: "+callQuality.getCallQualityRate());
			System.out.println("Customer name: "+callQuality.getCustomerName());
			
		}
		
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		
		catch(ClassNotFoundException e) {
			System.out.print(e);
		}
		
		catch(IOException ex) {
			System.out.print(ex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQuality obj1 = new CallQuality(123, 45, "B" ,"Peter Jones");
		
		CallQualityCollection collection = new CallQualityCollection();
		collection.saveCallQuality(obj1);
		collection.showCallQuality(obj1.getCallId());

	}

}
