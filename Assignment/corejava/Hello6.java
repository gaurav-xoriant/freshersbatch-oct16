import java.util.Scanner;
class Hello6{  
  public static void main(String[] args)  {  
    int c=0,a,temp;  
	for(int n=100;n<1000;n++)
	{
    temp=n;  
	
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number"+n);   
    
	}
   }  
}  