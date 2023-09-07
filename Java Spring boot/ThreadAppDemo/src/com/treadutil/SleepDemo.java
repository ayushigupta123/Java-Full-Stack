package com.treadutil;

class MyChildThread1 extends Thread
{
	public void run()
	{
		String threadname =Thread.currentThread().getName();
		System.out.println(threadname +" has started");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(" ");
		}
		
	}
}

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" has started");
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println("sleep interrupted "+e);
		}
		System.out.println("thread ended");
	}

}
