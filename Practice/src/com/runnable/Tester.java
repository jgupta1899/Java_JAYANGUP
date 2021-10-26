package com.runnable;

public class Tester 
{
	public static void main(String args[])
	{
		RunnableTask task = new RunnableTask();
		
		Thread t1 = new Thread(task, "One");
		Thread t2 = new Thread(task, "Two");
		Thread t3 = new Thread(task, "Three");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i = 0 ;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"exe counter #"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
