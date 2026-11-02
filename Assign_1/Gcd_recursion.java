//Euclid's Algorithm
import java.util.Scanner;

public class Gcd_recursion {
	
	public static int gcd_recurssion(int a,int b)
	{ int r;
		if(b==0)
			return a;
//		if(a==1)
//			return 1;
	      r=(a%b);
		if( r ==0)
			return b;
		return	gcd_recurssion(b, r);
	}

	public static void main(String[] args) {

		System.out.println("enter 2 no : ");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		int h=gcd_recurssion(a,b);
		System.out.println(h);
 sc.close();

		
	}

}
