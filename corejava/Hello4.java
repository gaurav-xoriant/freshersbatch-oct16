import java.util.Scanner;
public class Hello4{	
public static void main(String args[]){
	Scanner se=new Scanner(System.in);
	System.out.println("Enter table which you want to print");
	int table=se.nextInt();
	for(int i=1;i<=10;i++)
	{
		System.out.println(table*i);
	}
}
}