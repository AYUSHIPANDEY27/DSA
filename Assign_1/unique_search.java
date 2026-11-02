
public class unique_search {
	
	public static int unique(int arr[])
	{
	int r=arr.length-1;
		for (int i=0;i<=r;i++)
		{ 
			boolean flag =false;
			for(int j=0;j<=r;j++) {
			if(i!=j && arr[i] == arr[j])
			{
			flag=true;
			break;
			}
			
			}
			if(flag==false)
				return arr[i];
				
		}return -1;
	}
	

	public static void main(String[] args) {
		
		int arr []=  { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		  int o=unique(arr);
		System.out.println("unique value : "+o);

	}

}
