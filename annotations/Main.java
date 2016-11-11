package com.annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class A{
	private int value;
	private int age;
	A(){
		value=10;
	}
	public void display(){
	System.out.println("Checking annotations ");
	}
	@Getter
	public int getValue(){
		return this.value;
	}
	@Getter
	public int getAge(){
		return this.age;
	}
	@Deprecated
	public String getName(){
		return "ABC";
	}
}
public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.annotations.A");
		Object a=c.newInstance();
		Method m[]=c.getMethods();
		//Annotation an[]=new Annotation[m.length];
		for(int i=0;i<m.length;i++){
			Annotation an[]=m[i].getDeclaredAnnotations();
			for(int j=0;j<an.length;j++){
				System.out.println(an);
				if(an[j] instanceof Getter){
					//System.out.println("Getter");
					String fname=m[i].getName();
					String substr=fname.substring(3, fname.length());
					System.out.println(substr);
					if(substr.equalsIgnoreCase("age") || substr.equalsIgnoreCase("value") )
						System.out.println("valid getter");
					else
						System.out.println("invalid getter");
				}
				else
					System.out.println("not getter");
			}		
			}
		}
			
}
