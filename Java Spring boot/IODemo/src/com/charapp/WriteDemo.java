/*
 *  Save below given values to file  and read from file using Character Stream classes
 
  Employee Name : Peter Sam Joes
 Department : Sales 
 Designation : Manager 
 Salary :35000
 */
package com.charapp;
import java.io.*;

public class WriteDemo {

	public static void main(String[] args) {
		
		String ename= "Peter sam Jones";
		String dpart="Sales";
		String designation = "Manager";
		int sal=35000;
		
		try {
			
			FileOutputStream fw= new FileOutputStream("char.txt");
			OutputStreamWriter os = new OutputStreamWriter(fw);
	            
	        os.write("Employee Name : Peter Sam Joes\n");
	        os.write("Department : Sales\n");
	        os.write("Designation : Manager\n");
	        os.write("Salary : 35000\n");
	        os.close();
				
		}
		catch(Exception e) {
			System.out.print(e);
		}
		try{
			FileReader fin= new FileReader("char.txt");
			
			BufferedReader bin=new BufferedReader(fin);
			
			char[] ch = new char[100];
			bin.read(ch);
			System.out.println(new String(ch));
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}

	}

}
