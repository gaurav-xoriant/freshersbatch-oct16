class QueuedArray
{
	private int values;
	private int rear=0;
	private int front=0;
	static int ary[]=new int[50];
	public void set(int values)
	{
		this.values=values;
		push();
	}
	public void push()
	{
		if(rear!=ary.length)
		{
			ary[rear]=this.values;
			rear++;
			System.out.println("pushed a item");
		}
		
	}
	public void pop()
	{
		if(front>=rear)
			front++;
		System.out.println("pushed a item");
	}
	public void show()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(ary[i]);
		}
	}
	public static void main(String args[])
	{
		QueuedArray s[]=new QueuedArray[5];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new QueuedArray();
		}
		s[0].set(1);
		s[1].set(2);
		s[0].pop();
		s[0].show();
	}
}