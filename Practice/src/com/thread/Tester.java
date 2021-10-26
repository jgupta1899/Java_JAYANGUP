package com.thread;

public class Tester {

	public static void main(String[] args) {

		NewThread nt = new NewThread("Hello");
		NewThread nt1 = new NewThread("Hello1");
		NewThread nt2 = new NewThread("Hello2");
		NewThread nt3 = new NewThread("Hello3");
		NewThread nt4 = new NewThread("Hello4");
		
		
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
