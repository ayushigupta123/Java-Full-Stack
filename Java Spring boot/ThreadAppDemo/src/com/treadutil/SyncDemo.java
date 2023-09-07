package com.treadutil;

class PrintNames implements Runnable
{
	private String[] names= {"Peter", "Sam", "Edgwe","Mathew","Simon"};
	
	public synchronized void printArray()
	{
		for(String s :names)
		{
			System.out.println(s);
		}
	}

	@Override
	public void run() {

		printArray();
		
	}

	
	
}

			  

public class SyncDemo {

	public static void main(String[] args) {

		PrintNames printNames = new PrintNames();
		
		Thread th1 = new Thread(printNames);
		Thread th2 = new Thread(printNames);
		th1.start();
		th2.start();
		

	}

}
