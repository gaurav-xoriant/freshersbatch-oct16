package com.reflect;
import java.lang.reflect.*;
class Mainopr{
	@SuppressWarnings("unused")
	public int printValue(int x){
		return x*10;
	}
}
class Middle {
	public Object invokeMethod(String classname,String methodname,Class paramtypes[],Object paramvalues[]) throws Exception{
		Class cls=Class.forName(classname);
		Object mainopr1 =cls.newInstance();
		Method m=cls.getDeclaredMethod(methodname, paramtypes[0]);
		Object m1 =m.invoke(mainopr1,5);
		return m1;
	}
}
public class MiddleMain {
	public static void main(String args[]) throws Exception {
		Class c[]=new Class[1];
		c[0]=int.class;
		Object paramvalues[]=new Object[1];
		paramvalues[0]=5;
		String methodname="printValue";
		String classname="com.reflect.Mainopr";
		Middle m1=new Middle();
		Object m=m1.invokeMethod(classname, methodname, c, paramvalues);
		System.out.println(m);
	}

}
