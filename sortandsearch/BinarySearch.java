package sortandsearch;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9};
		
		binarysearch(8,arr);
	}
	
	public static void binarysearch(int key,int arr[])
	{
		int mid;
		int left=0;
		int right=arr.length-1;
		
		while(right>=left)
		{
			mid=(right+left)/2;
			
			if(key==arr[mid])
			{
				System.out.println(key+"찾는 숫자 발견!! 배열에서"+mid+"번째 index");
				break;
			}
			
			if(key<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
	}
}