package fclty;
public class Faculty{
	public int roll;
	Faculty(int roll){
		this.roll=roll;
	}
	public void getStudentMarks(int roll){
		if(roll==12)
			System.out.println(89);
	}
	public void print(){
		System.out.println("In faculty");
	}
	
	
}