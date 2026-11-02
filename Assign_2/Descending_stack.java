import java.util.Scanner;

public class Descending_stack {
		private int top;
		private int arr[];
		private int size;
		

		public Descending_stack (int size)
		{
			this.size = size;
			top = size;
			arr = new int [size];//to allocate mem to array
		}
		
		public void push(int val)
		{
			if(isfull()) {
				System.out.println("stack is full");
				return;}
			top--;
			arr[top]=val;
			System.out.println("added..");
		}
		public int pop()
		{
			int temp=-1;
			if(isempty())
				System.out.println("empty stack...");
			else
			{
				temp=arr[top];
				top++;
				System.out.println("popped element : "+temp);
			}
	       return temp;
		}
		public int peek()
		{
			int temp=-1;
			if(isempty())
				System.out.println("empty stack...");
			else
			{
				temp=arr[top];
			}
	       return temp;
			
		}
		public boolean isfull()
		{
			return top==0;
		}
		public boolean isempty()
		{
			return top==size;
		}
		
	    public static void main(String[] args) {
	    	
	    	Descending_stack k= new Descending_stack (4);
	    	Scanner sc = new Scanner(System.in);
			int ch;
			do
			{
			System.out.println("enter the choice for \n0.EXIT \n 1.push \n 2.pop \n3.peek");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				 System.out.println("enter value: " );
				 int a=sc.nextInt();
				 k.push(a);
				break;
			case 2:
				int c=k.pop();
				System.out.println("polleed item : "+c);

				break;
			case 3:
				int s=k.peek();
				System.out.println("peek element : "+s);

				break;
		    default:
		    	System.out.println("invalid choice..");

			}


			}while(ch!=0);
			sc.close();
		}

	}

