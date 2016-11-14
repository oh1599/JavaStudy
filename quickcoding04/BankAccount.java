package quickcoding04;

public class BankAccount
{
	private int balance=100;
	
	public int getBalance()
	{
		return balance;
	}
	
	public void withDraw(int amount)
	{
		if(balance<0)
		{
			try
			{
				synchronized(this)
				{
					wait();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		balance-=amount;
	}
	
	public void add(int money)
	{
		balance+=money;
		System.out.println("종합 금액:"+balance+", "+money+"만큼 입금");
	}
	
	public void delete(int money)
	{
		balance-=money;
		System.out.println("종합 금액:"+balance+", "+money+"만큼 출금");
	}
}
