package com.treadutil;

class Cab
{ 
	
}

class CatchCab implements Runnable
{
	
	Cab cab;
	String name;
	public CatchCab(Cab cab,String name)
	{ 
		this.cab=cab;
		this.name=name;
	}
	public void run() 
	{ 
		synchronized(cab)
		{
			 try
			 { 
				 System.out.println("Cab is driven "+this.name);
				 cab.wait();
				 System.out.println("Cab is released by "+this.name);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		}
	}
}

class ThrowCab implements Runnable
{ 
	Cab cab;
	ThrowCab(Cab cab)
	{ 
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
			try {
				Thread.sleep(2000);
				 cab.notify();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class WaitDemo {

	public static void main(String[] args) {

		Cab cab1=new Cab();
		 CatchCab catch1=new CatchCab(cab1,"James");
		 ThrowCab throw1=new ThrowCab(cab1);
		 Thread t1=new Thread(catch1);
		 Thread t2=new Thread(throw1);
		 t1.start();
		 t2.start();

	}

}
