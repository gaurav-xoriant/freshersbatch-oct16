class Account
{
	private int amount;
	public Account()
	{
		amount=0;
	}
	public Account(int amount)
	{
		this.amount=amount;
	}
	public void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Deposited");
	}
	public void withdraw(int amount)
	{
		if(this.amount<amount)
			System.out.println("Not enough balance");
		this.amount-=amount;
		System.out.println("Withdrawn");
	}
	public void info()
	{
		System.out.println(amount);
	}
	public static void main(String args[])
	{
		Account grv=new Account(1200);
		grv.deposit(1000);
		grv.info();
		grv.withdraw(100);
		grv.info();
	}
}