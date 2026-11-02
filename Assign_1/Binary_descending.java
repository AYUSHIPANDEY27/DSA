import java.util.Scanner;

public class Binary_descending {
	
	public static int binary(int arr[],int k)
	{
		int l=0,r=arr.length-1,mid;
		 
		while(l <= r)
		{
			mid=(l+r)/2;
			if( k == arr[mid])
				return mid;
			else if (k > arr[mid])
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
	
//descending sort
	public static void main(String[] args) {
  
		int arr[]= {91,82,81,78,73,63,60,56,44,32,11,01};
		
		System.out.println("enter key : ");
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		
		int idx=binary(arr,k);
		if (idx != -1)
			System.out.println("key "+k+" found at index : "+idx);
		else 
			System.out.println(" not found...");		
		
	}

}
