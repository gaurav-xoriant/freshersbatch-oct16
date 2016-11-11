package com.nestedclass;
class Random{
	int r[]=new int[100];
	public void bloodcheck(){
		for(int i=0;i<100;i++){
			r[i]=(int)(Math.random()*220)+1;
			System.out.println(r[i]);
			if(r[i]>140){
			new Alert().warning();
			break;
			}
		}
		
	}
	class Alert{
		public void warning(){
			System.out.println("blood presuure out of control");
			
		}
	}
		
}
public class RMain {

	public static void main(String[] args) {
		Random r=new Random();
		r.bloodcheck();
	}

}
