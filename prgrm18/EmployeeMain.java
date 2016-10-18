class Employee
{
	private int no;
	private int salary;
	private int code;
	public Employee(int no,int salary,int code)
	{
		this.no=no;
		this.salary=salary;
		this.code=code;
	}
	public int getSalary()
	{
		return this.salary;
	}
	public String toString()
	{
		return "Number is "+no + "   salary is  "+salary + "   and code is  " + code;
	}
}
class Labour extends Employee
{
	public int overtime	;
	public Labour(int no,int salary,int code,int overtime)
	{
		super(no,salary,code);	  
		this.overtime=overtime;
	}
	public int getSalary()
	{
		 return super.getSalary()+this.overtime;
	}
}
class Manager extends Employee
{
	public int incentives;
	public Manager(int no,int salary,int code,int incentives)
	{
		super(no,salary,code);	  
		this.incentives=incentives;
	}
	public int getSalary()
	{
		return super.getSalary()+this.incentives;
	}
}
public class EmployeeMain
{
	static int sumSalary(Employee e[])
	{
		int total=0;
		for(int i=0;i<e.length;i++)
		{
			total += e[i].getSalary();
		}
		return total;
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[5];
		e[0]=new Employee(1,1200,100);
		e[1]=new Labour(2,1500,101,1000);
		e[2]=new Manager(3,1700,101,5000);
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e[2]);
		System.out.println("Total Salary of All Employee is : "+ sumSalary(e));
		
	}
}