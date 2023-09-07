/* 
 *   Save below values to a file using BufferOutpuStream and read using BufferInputStream

  Developer Name:<your name>
  Bug No:<Any Number>
  Bud Description:<Description Text>
 */
package com.byteapp;
import java.io.*;

public class BufferExercise {

	public static void main(String[] args) {

		String name="Ayushi Gupta";
		int bugno=23254;
		String description=" Error in code";
		
		try {
			FileOutputStream fo = new FileOutputStream("bufferdata.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fo);
			String data="Developer name: "+name+" Bug Number: "+bugno+" description: "+description;
			bout.write(data.getBytes());
			bout.flush();
			bout.close();
			System.out.println("Done");
		}
		catch(IOException e) {
			System.out.print(e);
		}
		
		

	}
/*
 * By Ayushi Gupta
 */
}
