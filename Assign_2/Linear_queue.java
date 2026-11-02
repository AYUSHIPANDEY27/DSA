//1. Write program to implement linear queue in which front and rear starts at 0.

import java.util.Scanner;

public class Linear_queue  {
	private int size;
	private int f;
	private int r;
	private int arr[];
	
	public Linear_queue(int size)
	{
		this.size = size;
		f=0;
		r=0;
		arr= new int[size];
	}
	
	public void  offer(int val) throws Exception
	{
		if(r==size) {
			System.out.println("Queue is full...");
			throw new  Exception("array full");
		}
		arr[r]=val;
		r++;
	      System.out.println("added..");
	
	}
	public int poll() throws Exception
	{
		int temp=0;
		if(f== r) {
			System.out.println("queue is empty");
			throw new Exception("queue empty");
		}
		temp= arr[f];
		f++;
		if(f==r)
			f=r=0;
		return temp;
	}
	
	public int peek()
	{
		int temp=0;
		if(f== r)
			System.out.println("queue is empty");
		else {
		temp= arr[f];}
		return temp;
	}
   public boolean isempty()
   {
	return r==f;
   }
   public boolean isfull()
   {
	return r==size;
   }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Linear_queue f=new Linear_queue(4);
		int ch;
		
		do
		{
			System.out.println("enter the choice for \n0.EXIT \n 1.offer \n 2.poll \n3.peek");
			 ch= sc.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("enter value to add : ");
			        int val= sc.nextInt();
			        
			       try {
					f.offer(val);
				} catch (Exception e) {
					e.printStackTrace();
				}
		       break;
			case 2 : try {
					f.poll();
					System.out.println("removed successfully..");
				} catch (Exception e) {
					e.printStackTrace();
				}
		       break;
			case 3 : int res= f.peek();
				System.out.println(res);
		       break;
		       default :
		    	   System.out.println("invalid choice");

				
			}

			
		}while(ch!=0);
		

		
		
sc.close();
	}

}
