package com.runnable;

public class RunnableTask implements Runnable 
{

	@Override
	public void run()
	{
		try
		{
			for(int i = 0 ;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+"exe counter #"+ i);
				Thread.sleep(500);

			}
		}catch(InterruptedException e)
		{
			System.out.println(Thread.currentThread().getName()+"Got error : "+e);
		}
		System.out.println(Thread.currentThread().getName()+"Over ");

	}

	
	

}
