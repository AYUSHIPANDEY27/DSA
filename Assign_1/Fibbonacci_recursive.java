import java.util.Scanner;

public class Fibbonacci_recursive {
	public static int fibonacci(int n )
	{ 
		if(n<=1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println("enter no  : ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
       for(int i=0;i<=a;i++)
       System.out.println(fibonacci(i));

	}

}

