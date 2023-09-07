/*
 * #create a stream of below given value using a builder 
   "BaudeRate"
   "Ohm"
   "Kilowatt"
   "Bits"
   "Analog"
   "Digital"


Iterate through the stream using forEach loop 



#Create a stream using iterator function for fibonnauci sereis 

#Create a stream using generator function to print prime numbers ;

 * 
 */

package com.mystream;
import java.util.stream.Stream;;

public class IterateDemo {

	public static void main(String[] args) {

		 Stream<String> valueStream = Stream.<String>builder()
	                .add("BaudeRate")
	                .add("Ohm")
	                .add("Kilowatt")
	                .add("Bits")
	                .add("Analog")
	                .add("Digital")
	                .build();

	        valueStream.forEach(System.out::println);
	        
	    
		   
		   
		   
		   
	
		   


	}

}
