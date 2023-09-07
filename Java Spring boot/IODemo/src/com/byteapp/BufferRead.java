/*
 * to read bufferdata exercise part 2
 */
package com.byteapp;

import java.io.*;

public class BufferRead {

	public static void main(String[] args) {

		try{
			FileInputStream fin= new FileInputStream("bufferdata.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			
			byte[] bt = new byte[bin.available()];
			bin.read(bt);
			System.out.println(new String(bt));
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}


	}
	/*
	 * Ayushi Gupta
	 */

}
