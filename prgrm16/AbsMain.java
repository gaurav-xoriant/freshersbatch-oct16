abstract Class Shape{
	
	abstract public void draw();
	public void mode(){
		System.out.println("inside mode of shape");
	}
}
Class Point extends Shape{
	
	public void draw(){
		System.out.println("Inside point");
	}
	public void display(){
		System.out.println("Created point");
	}
}
class Line extends Shape{
	
	public void draw(){
		System.out.println("Inside line");
	}
	public void display(){
		System.out.println("Created line");
	}
}
public class AbsMain{
	public static void main(String args[]){
		Shape s=new Shape();
		s.mode();
	}
}