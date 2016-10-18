abstract class Persistence{
	abstract public void type();
}
class FileP extends Persistence{
	public void type(){
		System.out.println("File type");
	}
}
class DatabaseP extends Persistence{
	public void type(){
		System.out.println("Database type");
	}
}
class PersistFactory{
	public static Persistence getPersist(){
		return new FileP();
	}
}
public class AbsMain3{
	public static void main(String args[]){
		Persistence p=PersistFactory.getPersist();
		p.type();
	}
}