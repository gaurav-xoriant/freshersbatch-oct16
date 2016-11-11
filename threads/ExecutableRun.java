package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutableRun
{
	public ExecutableRun()
	{
		ExecutorService ex=Executors.newFixedThreadPool(3);
		Runnable rn1 = new Runnable() {
			public void run() {
					for(int i=0;i<10;i++)
					{
						System.out.println("PING");
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {}
					}
			}
		};
		Runnable rn2 = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++)
					{
						System.out.println("\tPONG");
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {}
					}
			}
		};
		Runnable rn3 = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++)
					{
						System.out.println("\t\tTONG");
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {}
					}
				}
		};
			
		ex.execute(rn1);
		ex.execute(rn2);
		ex.execute(rn3);
		ex.shutdown();		
}	
	public static void main(String[] args)
	{
		ExecutableRun er=new ExecutableRun();
	}
}
