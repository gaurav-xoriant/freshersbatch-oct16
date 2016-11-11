package com.exception;
public class AutoClose implements AutoCloseable{
	void divide(){
		int x=5/0;
		System.out.println("divided successfully");
	}
	public static void main(String args[]){
		 try(AutoClose ac =new AutoClose()){
			 System.out.println("in try");
		 }
		
 catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@Override
	public void close() throws Exception {
		System.out.println("closing my close method");
		
	}
}