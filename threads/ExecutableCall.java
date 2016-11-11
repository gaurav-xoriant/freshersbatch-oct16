package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutableCall
{
	public ExecutableCall()
	{
		ExecutorService ex=Executors.newFixedThreadPool(3);
		Callable<Void> callable1 = new Callable<Void>(){
			@Override
			public Void call() throws Exception {
				for(int i=0;i<10;i++)
				{
					System.out.println("ping");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {}
				}
				return null;
			}
			};
			Callable<Void> callable2 = new Callable<Void>(){
				@Override
				public Void call() throws Exception {
					for(int i=0;i<10;i++)
					{
						System.out.println("\tpong");
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {}
					}
					return null;
				}
			};
			Callable<Void> callable3 = new Callable<Void>(){
					@Override
					public Void call() throws Exception {
						for(int i=0;i<10;i++)
						{
							System.out.println("\t\ttong");
							try {
								Thread.sleep(300);
							} catch (InterruptedException e) {}
						}
						return null;
					}
			};
			
		ex.submit(callable1);
		ex.submit(callable2);
		ex.submit(callable3);
		ex.shutdown();		
}	
	public static void main(String[] args)
	{
		ExecutableCall er=new ExecutableCall();
	}
}

