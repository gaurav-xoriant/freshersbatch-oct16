interface Printable{
	public void print();
}
class Circle implements Printable{
	public void print(){
		System.out.println("in circle");
	}
}
class Employee implements Printable{
	public void print(){
		System.out.println("in employee");
	}
}
public class InterMain{
	public static void printAll(Printable p[]){
		for(int i=0;i<p.length;i++)
			p[i].print();
			//System.out.println(p[i].print());
	}
	public static void main(String ars[]){
		Printable p[]=new Printable[2];
		p[0]=new Circle();
		p[1]=new Employee();
		printAll(p);
	}
}