package com.treadutil;

class MyRunner implements Runnable
{
	int i=0;
	public void run()
	{
		Thread th=Thread.currentThread();
		System.out.println(th.getName()+" is running");
		for(i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
	}
}

public class RunnerDemo {

	public static void main(String[] args) {

		MyRunner myRunner =new MyRunner();
		
		Thread th1 = new Thread(myRunner);
		Thread th2 = new Thread(myRunner);
		th1.setName("Child thread 1");
		th2.setName("Child thread 2");
		th1.start();
		th2.start();
		
		

	}

}
