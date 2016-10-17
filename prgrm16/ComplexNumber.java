class ComplexNumber
{
int real;
int img;
	public ComplexNumber()
	{
		real=0;
		img=0;
	}
	public ComplexNumber(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	public void show()
	{
		System.out.println("real part"+real+"img part"+img);
	}
	public void add(ComplexNumber a[])
	{
		for(int i=0;i<a.length;i++)
		{
			this.real+=a[i].real;
			this.img+=a[i].img;
		}
	}
	public void sub(ComplexNumber a[])
	{
		for(int i=0;i<a.length;i++)
		{
			this.real=a[i].real-this.real;
			this.img=a[i].img-this.img;
		}
	}
	
	public void multiply(ComplexNumber a[])
	{
		if(this.real==0)
			this.real=1;
		if(this.img==0)
			this.img=1;
		for(int i=0;i<a.length;i++)
		{
			this.real=a[i].real*this.real;
			this.img=a[i].img*this.img;
		}
	}
	public void swap(ComplexNumber a[])
	{
			ComplexNumber swap=a[0];
			a[0]=a[1];
			a[1]=swap;
	}
	public static void main(String args[])
	{
		ComplexNumber a[]=new ComplexNumber[2];
		a[0]=new ComplexNumber(12,12);
		a[1]=new ComplexNumber(10,10);
		ComplexNumber sum =new ComplexNumber();
		sum.add(a);
		sum.show();
		sum.sub(a);
		sum.show();
		sum.multiply(a);
		sum.show();
		a[0].swap(a);
		sum.show();
		
		
	}
}