import java.util.*;
abstract class DesertItem{
	abstract public int cost();
}
class Candy extends DesertItem{
	private int cost;
	private int qty;
	private String name;
	public Candy(int cost,int qty,String name){
		this.cost=cost;
		this.qty=qty;
		this.name=name;
	}
	public int cost(){
		return this.cost;
	}
}
class Cookie extends DesertItem{
	private int cost;
	private int qty;
	private String name;
	public Cookie(int cost,int qty,String name){
		this.cost=cost;
		this.qty=qty;
		this.name=name;		
	}
	public int cost(){
		return this.cost;
	}
}
class IceCream extends DesertItem{
	private int cost;
	private int qty;
	private String name;
	public IceCream(int cost,int qty,String name){
		this.cost=cost;
		this.qty=qty;
		this.name=name;		
	}
	public int cost(){
		return this.cost;
	}
}
public class AbsMain4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		//DesertItem d[]=new DesertItem[20];
		ArrayList<Candy> c=new <Candy>();
		ArrayList<Cookie> ck=new Cookie();
		ArrayList<IceCream> ic=new IceCream();
		//int topc=0,topck=0,topic=0;
		System.out.println("Welcome into Candy shop");
		System.out.println("Enter your role");
		System.out.println("Enter 1. Owner 2. customer");
		int i=sc.nextInt();
		if(i==1){
			System.out.println("welcome owner");
			System.out.println("What item do you want to add 1.candy 2.cookie 3.IceCream");
			int j=sc.nextInt();
			int k,l;
			String s;
			switch(j){
				case 1 :System.out.println("Enter cost of candy");
						 k=sc.nextInt();
						System.out.println("Enter Qty of candy");
						 l=sc.nextInt();
						System.out.println("Enter name of candy");
						 s=sc.next();
						 c.add(k,l,s);
						//c[top]=new Candy(k,l,s);
						break;
				case 2 :System.out.println("Enter cost of cookie");
						 k=sc.nextInt();
						System.out.println("Enter Qty of cookie");
						 l=sc.nextInt();
						System.out.println("Enter name of cookie");
						 s=sc.next();
						 ck.add(k,l,s);
						//ck[]=new Cookie(k,l,s);
						break;
				case 3 :System.out.println("Enter cost of IceCream");
						 k=sc.nextInt();
						System.out.println("Enter Qty of IceCream");
						 l=sc.nextInt();
						System.out.println("Enter name of IceCream");
						 s=sc.next();
						 ic.add(k,l,s);
						//ic[]=new IceCream(k,l,s);
						break;
				default :System.out.println("wrong option");
						break;
			}		
		}
		else{
			System.out.println("welcome customer");
			System.out.println("What item do you want to buy 1.candy 2.cookie 3.IceCream");
			int j=sc.nextInt();
			switch(j){
				case 1:System.out.println("");
				
			}
		}
			
		
		
	}
}