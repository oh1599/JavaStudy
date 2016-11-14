package quickcoding03;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class QuickCoding03
{
	public static void main(String[] args)throws numberOverException
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��Ͻÿ�");
		String input1=scanner.nextLine();
		String input2=scanner.nextLine();
				
		try
		{
			int inputNum1=Integer.parseInt(input1);
			int inputNum2=Integer.parseInt(input2);
			if(inputNum1>999||inputNum2>999)
			{
				throw new numberOverException();
			}
			int result=inputNum1/inputNum2;
			System.out.println("����� "+result);
		}
		catch(NumberFormatException ie)
		{
			System.out.println("���ڸ� �Է����ּ���");
			ie.printStackTrace();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("0���� ������ �����ϴ�.");
			ae.printStackTrace();
		}
		catch(numberOverException a1)
		{
			System.out.println("�� �ڸ� �̻��� ���� �Է��� �� �����ϴ�.");
			a1.printStackTrace();
		}
		
	}
}

class numberOverException extends Exception
{
	public numberOverException()
	{
		super();
	}
}