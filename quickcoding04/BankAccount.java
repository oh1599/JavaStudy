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
		System.out.println("���� �ݾ�:"+balance+", "+money+"��ŭ �Ա�");
	}
	
	public void delete(int money)
	{
		balance-=money;
		System.out.println("���� �ݾ�:"+balance+", "+money+"��ŭ ���");
	}
}
