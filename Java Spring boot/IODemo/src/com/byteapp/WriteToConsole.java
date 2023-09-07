package com.byteapp;
import java.io.*;

public class WriteToConsole {

	public static void main(String[] args) {

		try {
		/* Read from console
		PrintStream pout=System.out;
		pout.write("Hello World".getBytes());
		*/
			InputStream in =System.in;
			byte[] bt= new byte[20];
			in.read(bt);
			String str =new String(bt);
			System.out.println("You have written "+str);
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
	
