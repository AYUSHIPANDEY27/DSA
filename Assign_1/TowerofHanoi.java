import java.util.Scanner;

public class TowerofHanoi {
	
	public static void towerOfHanoi(int n,char src, char hlper,char destn)
	{
		if(n==1)
		{
			System.out.println("move disk 1 from "+src+" to "+destn);
			return ;
		}
		towerOfHanoi(n - 1, src, destn, hlper);
        System.out.println("Move disk " + n + " from " + src + " to " + destn);
        towerOfHanoi(n - 1, hlper, src, destn);
	}

	public static void main(String[] args) {
    System.out.println("Enter no of disks : ");
    Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
 	towerOfHanoi(n,'a','b','c');

sc.close();
		
		
	}

}
