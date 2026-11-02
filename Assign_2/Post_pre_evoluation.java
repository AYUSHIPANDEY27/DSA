//4. Implement following algorithms for multi digit operands (use space to seperate operands)
//postfix
public class Post_pre_evoluation {
	
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
	public static int post(String []d)
	{    
		int top=-1;
		int st[]=new int [30];
		for(int i=0;i<d.length;i++)
		{
			String f=d[i].trim();
			if(f.isEmpty()) // first incoming space is handled here if not handled it is giving StringIndexOutOfBoundsException
				continue;
			char e= f.charAt(0);
			if(Character.isDigit(e))
			{
				st[++top]=Integer.parseInt(f);	
			}
			else
			{
				int op2=st[top--];
				
				int op1 =st[top--];
				
				int res=operation(op1,op2,e);
				st[++top]=res;	
			}
			
			
		}	return st[top];
	}

	public static void main(String[] args) {
		String s =" 10 2 5 * + 3 4 * -";//expression have space 
		String a="4 2 $ 20 6 % + 10 -";
		
	String arr[]=s.split(" ");
	String str[]=s.split(" ");

	
	
	int q=post(arr);
	int p=post(arr);

	
	System.out.println("result : "+q);//8
	System.out.println("result : "+p);//8


	}

}
//----------------------------------------------------------
//with trim and split together.

/*
 public class Post_pre_evoluation {
	
	public static int operation(int a, int b, char e) {
		switch (e) {
			case '$' : return (int)Math.pow(a, b);
			case '*' : return a * b;
			case '/' : return a / b;
			case '%' : return a % b;
			case '+' : return a + b;
			case '-' : return a - b;
		}
		return 0;
	}

	public static int post(String[] d) {    
		int top = -1;
		int st[] = new int[30];
		
		for(int i = 0; i < d.length; i++) {
			String f = d[i]; // No trim needed here
			char e = f.charAt(0);
			
			if(Character.isDigit(e)) {
				st[++top] = Integer.parseInt(f);	
			} else {
				int op2 = st[top--];
				int op1 = st[top--];
				int res = operation(op1, op2, e);
				st[++top] = res;	
			}
		}	
		return st[top];
	}

	public static void main(String[] args) {
		String s = " 10 2 5 * + 3 4 * -";
		
		// 1. Pehle pure string ke aage-piche ka space saaf kiya (.trim())
		// 2. Phir ek ya ek se zyada spaces ("\\s+") ke basis par split kiya'
		
		String arr[] = s.trim().split("\\s+");
		
		
		\\s this is reg.expression  used for all types of spaces together • Normal space ( )
• Tab space (\t)
• New line (\n)   # + :-  means One or more times 
		
		int q = post(arr);
		System.out.println("result : " + q); // Output: 8
	}
}
 
 */


