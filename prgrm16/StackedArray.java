class StackedArray
{
	private int values;
	static int top=0;
	static int ary[]=new int[50];
	public void set(int values)
	{
		this.values=values;
		push();
	}
	public void show()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(ary[i]);
		}
	}
	public void push()
	{
		if(top!=ary.length)
		{
			ary[top]=this.values;
			top++;
		}
		System.out.println("pushed a item");
	}
	public void pop()
	{
		if(top!=0)
		top--;
		System.out.println("poped a item");
	}
	public static void main(String args[])
	{
		StackedArray s[]=new StackedArray[5];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new StackedArray();
		}
		s[0].set(10);
		s[1].set(12);
		s[0].show();
		s[0].pop();
		s[0].show();
	}
}