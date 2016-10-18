class Abc{
	int id;
	Abc(int id){
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
			Abc e=new Abc(10);
			System.out.println(e);
			Abc e1=(Abc)e.clone();
			System.out.println(e1);
		}
		catch(CloneNotSupportedException c){}
		
	}
}