import java.util.Scanner;
public class Hello3{	
public static void main(String args[]){
	Scanner se=new Scanner(System.in);
	System.out.println("Enter marks 1");
	int S1=se.nextInt();
	System.out.println("Enter marks 2");
	int S2=se.nextInt();
	System.out.println("Enter marks 3");
	int S3=se.nextInt();
	int count=0;
	if(S1 >=60)
	count++;
	
	if(S2>=60)
	count++;
	
	if(S3>=60)
	count++;

	if(count==3)
		System.out.println("Passed");
	
	if(count==2)
	System.out.println("Promoted");
	if(count <2)
	{	System.out.println("Failed");}
}
}