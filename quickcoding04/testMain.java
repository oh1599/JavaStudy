package quickcoding04;

public class testMain
{
	public static BankAccount account=new BankAccount();
	
	public static void main(String[] args)
	{
		Thread depositMan=new Thread(){
			public void run()
			{
				for(int i=0;i<100;i++)
				{
					account.add(10);
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread withdrawMan=new Thread(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					account.delete(5);
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		
		depositMan.start();
		withdrawMan.start();
			
				
	}
}
