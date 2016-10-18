interface Sortable{
	public  boolean compare(Sortable a);
	public int get();
}
class Circle implements Sortable{
	private int radius;
	 Circle(int radius){
		this.radius=radius;
	}
	public int get(){
		return this.radius;
	}
	public  boolean compare(Sortable a){
		if(this.radius>a.get())
			return false;
		else 
			return true;
	}
	public String toString(){
		return ""+radius;
	}
}
class Employee implements Sortable{
	private int id;
	public Employee(int id){
		this.id=id;
	}
	public int get(){
		return this.id;
	}
	public  boolean compare(Sortable a){
		if(this.id>a.get())
			return false;
		else
			return true;
	}
}
class InterMain1{
	public static void sortAll(Sortable s[]){
		Sortable temp;
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
				if(s[i].compare(s[j])){
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
					
			}
		}
	}
	public static void main(String args[]){
		Sortable s[]=new Sortable[2];
		s[0]=new Circle(1);
		s[1]=new Circle(5);
			sortAll(s);
			System.out.println(s[0]);;
		//Sortable s1[]=new Sortable[2];
		//s[0]=new Employee(10);
		//s[1]=new Employee(5);	
	}
}