class Emp{
	int id;
	Emp(int id){
		this.id=id;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();
	}
}