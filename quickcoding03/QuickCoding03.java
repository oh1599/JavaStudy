package quickcoding03;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class QuickCoding03
{
	public static void main(String[] args)throws numberOverException
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력하시오");
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
			System.out.println("결과는 "+result);
		}
		catch(NumberFormatException ie)
		{
			System.out.println("숫자를 입력해주세요");
			ie.printStackTrace();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("0으로 나눌수 없습니다.");
			ae.printStackTrace();
		}
		catch(numberOverException a1)
		{
			System.out.println("세 자리 이상인 수는 입력할 수 없습니다.");
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