class Date
{
	int day;
	int month;
	int year;
	Date()
	{
		day=25;
		month=12;
		year=2016;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	
	}
	public void show()
	{
		System.out.println("Day is "+day+" Month is "+month+" Year is "+year);
	}
	public void swap(Date a[])
	{
		Date swap;
		swap=a[0];
		a[0]=a[1];
		a[1]=swap;
	}
public static void main(String args[])
{
	Date d[]= new Date[2];
	d[0]=new Date(12,12,1994);
	d[1]=new Date(12,10,1999);
	Date d1=new Date();
	d1.swap(d);
	d[0].show();
	d[1].show();
	
}
}