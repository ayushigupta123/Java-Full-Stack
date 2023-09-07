package com.ref;
import java.util.function.Predicate;

public class CandidateSelection {
	
	static Predicate<Integer> agePredicate = age -> age > 18;


	public static void main(String[] args) {
	    int[] agearray = { 12, 23, 11, 19, 35, 22 };
	   
	    Candidate candidate = new Candidate();
	   
	    for (int age : agearray) {
	        if (agePredicate.test(age)) {
	            System.out.println(age + " is a valid age");
	        } else {
	            System.out.println(age + " is an invalid age");
	        }
	    }
	}






	

}
