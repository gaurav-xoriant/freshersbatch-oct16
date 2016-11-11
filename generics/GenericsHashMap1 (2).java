package com.generics;
class Wrappergen<T>{
	T t;
	public Wrappergen() {
	}
	public void set(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
	
}
public class GenericWrapper {

	public static void main(String[] args) {
		Wrappergen<String> wg=new Wrappergen<String>();
		String s="abc how are u";
		wg.set(s);
		String wt=wg.get();
		System.out.println(wt);
		
	}

}
