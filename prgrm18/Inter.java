class Inter{
	int id;
	Inter(int id){
		this.id=id;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();
	}
	public String toString(){
		return ""+id;
	}
	public static void main(String args[]){
		try{
			System.out.println("try");
			Inter e=new Emp(10);
			System.out.println(e);
			Inter e1=(Inter)e.clone();
			System.out.println(e1);
		}
		catch(CloneNotSupportedException c){}
		
	}
}
/*
class Student18 implements Cloneable{  
int rollno;  
String name;  
  
Student18(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
Student18 s1=new Student18(101,"amit");  
  
Student18 s2=(Student18)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
} */