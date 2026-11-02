import java.util.Stack;

public class Pre_multidigit {
	public static int operation(int a,int b, char e)
	{
		switch (e) 
		{
		case '$' :return (int)Math.pow(a, b);
		case '*' :return a*b;
		case '/' :return a/b;
		case '%' :return a%b;
		case '+' :return a+b;
		case '-' :return a-b;

		}return 0;
		
	}

	public static int pre(String []c)
	{
		Stack<Integer> st= new Stack<Integer>();
		
		for(int i=c.length-1;i>=0;i--)
		{ 
			String f = c[i];
			char t=f.charAt(0);//String ka pehla character pick kiya ..it will always be 0.
			if(Character.isDigit(t))
			{
				int k= Integer.parseInt(f);
				st.push(k);	
			}
			else
			{
				int op1=st.pop();
				int op2=st.pop();
				int res=operation(op1,op2,t);
				st.push(res);
			}	
		}	
		return st.peek();
	}
	
	
	public static void main(String[] args) {
		
		String d="* + 10 2 - 5 3";

		String arr[]=d.trim().split("\\s+");
		
		int res=pre(arr);
		System.out.println("REsult : "+res);//24
	}

}
