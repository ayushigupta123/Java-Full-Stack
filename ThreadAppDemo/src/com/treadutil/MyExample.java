package com.treadutil;

import java.util.Scanner;

class User extends Thread
{
	public void run()
	{
		String name;
		String email;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter email: ");
		email=sc.nextLine();
		System.out.println("User is "+name+" email is "+email);
	}
}

class SimpleInterest extends Thread
{
	public void run()
	{
		double principle=12000;
		double rate=3;
		double time=4;
		double interest = (principle*rate*time)/100;
		System.out.println("Simple interest is "+interest);
	}
}

public class MyExample {

	public static void main(String[] args) {

		User user =new User();
		SimpleInterest simpleInterest =new SimpleInterest();
		user.start();
		simpleInterest.start();

	}

}
