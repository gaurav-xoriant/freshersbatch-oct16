abstract class Shape{
	public abstract void draw();
}
class Line extends Shape{
	//Line(){}
	public void draw(){
		System.out.println("Overriding in Line");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("Overriding in Circle");
	}
}
class Rectangle extends Shape{
	public void draw(){
		System.out.println("Overriding in Rectangle");
	}
}
class AbsMain2{
	public static void main(String args[]){
		Shape s[]=new Shape[5];
		s[0]=new Line();
		s[1]=new Circle();
		s[2]=new Rectangle();
		s[0].draw();
		
	}
	
}