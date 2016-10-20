class A{
	@Deprecated
	//@SuppressWarnings( "deprecation" )
	public void display(){
	System.out.println("Checking annotations ");
	}
}
//@SuppressWarnings( "deprecation" )
class Main {
	@SuppressWarnings( "deprecation" )
	public static void main(String[] args) {
		A a=new A();
		a.display();
	}

}
