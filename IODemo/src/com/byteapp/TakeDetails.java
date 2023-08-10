/*
 *   Exercise 
1.Create a class to accept below details 
developer name 
bug no:-
bug description :-

using InputStream instance from System.ing

Store the above info to a file named buginfo.dat and then print 
By Ayushi Gupta
 */
package com.byteapp;


import java.io.*;

public class TakeDetails {

	public static void main(String[] args) {
		
		try {
				FileOutputStream fo= new FileOutputStream("buginfo.dat");
				InputStream in =System.in;
				byte[] bt= new byte[20];
				byte[] bt1= new byte[20];
				byte[] bt2= new byte[20];
				
				System.out.println("Enter Developer Name: ");
				in.read(bt);
				String name=new String(bt);
				System.out.println("Enter bug no: ");
				in.read(bt1);
				String bugno= new String(bt1);
				System.out.println("Bud description: ");
				in.read(bt2);
				String description=new String(bt2);
				
				fo.write(bt);
		
				fo.write(bt1);
				
				fo.write(bt2);
	
				
				System.out.println(name+" "+ bugno+" "+ description);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}

	}

}
