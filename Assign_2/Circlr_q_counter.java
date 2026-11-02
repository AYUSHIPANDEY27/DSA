	import java.util.Scanner;

	
	public class Circlr_q_counter {
	    private int size;
		private int arr[];
		private int f,r;
		private int count =0;

		public Circlr_q_counter(int size) {
		    this.size = size;
			arr = new int [size];
			f = -1;
			r =-1;
		}
	    public void offer(int val)
	    {
	    	if(isfull())
	    		System.out.println("queue is full..");
	    	else {
	    	r=(r+1)%size;
	    	arr[r]=val;
	    	count++;
	    	System.out.println("added..");}
	    }
	    public  int  poll()
	    {   int temp=-1;
	    	if(isempty())
	    		System.out.println("queue is empty");
	    	else {
	    	temp =arr[(f+1)%size];
	    	f=(f+1)%size;
	    	count--;
	    	System.out.println("removed....");
	    	if(f==r)
	    		f=r=-1;
	    	return temp;
	    	}
	    	return temp;
	    }
	    public int peek()
	    {
	    	int temp=-1;
	    	if(isempty())
	    		System.out.println("empty queu..");
	    	temp=arr[(f+1)%size];
	    	return temp;
	    }
	    public  boolean isfull()
	    {
	    	return count==size;
	    }
	    public boolean isempty()
	     {
	    	return count==0;
	    		
	    }
	    

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			Circlr_q_counter q= new Circlr_q_counter(4);
			int ch;
			do
			{
			System.out.println("enter the choice for \n0.EXIT \n 1.offer \n 2.poll \n3.peek");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				 System.out.println("enter value: " );
				 int a=sc.nextInt();
				 q.offer(a);
				break;
			case 2:
				int c=q.poll();
				System.out.println("polleed item : "+c);

				break;
			case 3:
				int s=q.peek();
				System.out.println("peek element : "+s);

				break;
		    default:
		    	System.out.println("invalid choice..");

			}


			}while(ch!=0);
			sc.close();
		}

	}
