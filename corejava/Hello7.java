import java.util.Scanner;
public class Hello7{
public static void main(String args[])
{
	Scanner se=new Scanner(System.in);
int attempts=0;
while(attempts<3)
{
	System.out.println("Enter fname");
String fname=se.next();
System.out.println("Enter lname");
String lname=se.next();
	if(fname.equals("gaurav") && lname.equals("shukla"))
	{	System.out.println("Welcome");
		break;
	}
	else
		attempts++;
	
}
if(attempts>=3)
		System.out.println("Locked");
}
}