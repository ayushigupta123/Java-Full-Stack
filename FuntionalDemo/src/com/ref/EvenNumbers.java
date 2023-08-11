/*
 *  .Use Method reference with Predicate Functional interface and display only those values that are even nos 
  int[] arr={12,23,11,19,25,32,16,22}

 */

package com.ref;
import java.util.function.Predicate;

public class EvenNumbers {
	
	public static boolean isEvenNumber(int num) 
	{ 
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		
		int[] arr = {12, 23, 11, 19, 25, 32, 16, 22}; 
		Predicate<Integer> isEven = EvenNumbers::isEvenNumber; 
		for (int num : arr) 
		{ 
			if (isEven.test(num)) 
			{ 
				System.out.println(num); 
				} 
			} 
		} 
	
	

}
