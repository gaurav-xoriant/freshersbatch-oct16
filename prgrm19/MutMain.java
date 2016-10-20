class MutMain{
public static void main(String args[]){
	String s=new String("Hello");
	String s1="Hello";
	if(s==s1)
		System.out.println("String is Mutable");
	else
		System.out.println("String is IMMutable");
	StringBuffer bs=new StringBuffer("Hello");
	StringBuffer bs1=bs.append("how are you");
	if(bs==bs1)
		System.out.println("StringBuffer is Mutable value of bs is "+bs+"value of bs1 is "+bs1);
	else
		System.out.println("StringBuffer is IMMutable");
}
}