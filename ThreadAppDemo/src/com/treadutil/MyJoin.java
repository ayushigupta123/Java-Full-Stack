package com.treadutil;

import java.util.Scanner;

class UserDetails extends Thread
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

class CountThread extends Thread
{
	public void run()
	{
		int count=1;
		while(Thread.currentThread().isAlive())
		{
			System.out.println("Count: "+count);
			count++;
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class MyJoin {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		CountThread countThread = new CountThread();
		user.start();
		countThread.start();
		try {
			user.join();
			countThread.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}	
	}
}
