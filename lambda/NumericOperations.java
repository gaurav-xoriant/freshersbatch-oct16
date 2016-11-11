package com.lambda;

public class NumericOperations{
	public static void main(String[] args) {
		int x=10;
		int y=20;
		Operation op=(a,b)->x+y;
		int r=op.perform(x, y);
		System.out.println(r);
		
		Operation op1=(a,b)->x-y;
		int r1=op1.perform(x, y);
		System.out.println(r1);
	}
}
