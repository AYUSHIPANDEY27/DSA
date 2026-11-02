


	import java.util.Scanner;
	public class Linear_nth
	{
		
		public static int linear(int arr[], int key)
		{
			int r=arr.length-1;
		   // for( int i=r;i>=0;i--)
			for( int i=0;i<=r;i++)
		    {
		    	if(key == arr[i])
		    		return i;
		    }
		    return -1;
			
		}
		public static void main(String[] args) {
	      
			int arr[]= {11,66,23,67,88,37,29,52,03,13,89};
			
			System.out.println("enter key :");
			Scanner sc = new Scanner(System.in);
			int k= sc.nextInt();
		int idx	=linear(arr,k);
		if (idx != -1)
		System.out.println("key "+k+" found at index : "+idx);
		else
			System.out.println("not found ..");

		}

	}



