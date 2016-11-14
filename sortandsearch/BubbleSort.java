package sortandsearch;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] index = { 80, 40, 70, 30, 10, 60, 50, 20 };
	    int i, j, temp;

	    for (i = 0; i < index.length - 1; i++)
	    {
	      for (j = 0; j < index.length - 1 - i; j++)
	      {
	        if (index[j] > index[j + 1])
	        {
	          temp = index[j];
	          index[j] = index[j + 1];
	          index[j + 1] = temp;
	        }
	      }
	    }
	
	    for (i = 0; i < index.length; i++)
	    {
	          System.out.print(index[i] + " ");
        }
	}
}
