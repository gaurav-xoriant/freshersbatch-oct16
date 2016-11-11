package com.exception;
class InsufficientBalance extends Exception{
	String message;
	InsufficientBalance(){
		this.message="";
	}
	InsufficientBalance(String msg){
		this.message=msg;
	}
	public String toString(){
		return "Insufficient balance in your account      "+this.message;
	}
}
class Withdraw{
	public void credit(int balnc) throws InsufficientBalance{
		if(balnc>1000){
			throw new InsufficientBalance("InsufficientBalance " + balnc);
		}
	}
}
public class BankMain {

	public static void main(String[] args) {
		Withdraw wd=new Withdraw();
		try {
			wd.credit(200000);
		} catch (InsufficientBalance e) {
			e.printStackTrace();
		}

	}

}
