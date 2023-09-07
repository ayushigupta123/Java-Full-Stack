/*
 * 2.Create a class to read details from buginfo.dat and print on screen
 * Ayushi Gupta
 */
package com.byteapp;

import java.io.FileInputStream;

public class ReadDetails {

	public static void main(String[] args) {
		
		try{
			FileInputStream fin= new FileInputStream("buginfo.dat");
			
			byte[] bt = new byte[fin.available()];
			fin.read(bt);
			for(byte b:bt)
			{
				System.out.print((char)b);
			}
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}

	}

}
