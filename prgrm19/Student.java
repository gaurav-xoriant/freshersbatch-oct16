package stdnt;
import fclty.*;
public class Student{
	public static void main(String args[]){
		Faculty f= new Faculty(12);
		getStudentMarks(f.roll);
		System.out.println("in student");
	}
}