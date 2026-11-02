//1. Write all possibilites to check palindrome(number, array, string, linked list, tree) on paper. Also do time and space complexity analysis of all and compare.

import java.util.Scanner;

public class Palindrome_arr {
	
	public static boolean palindrome(char arr[])
	{
		int s= arr.length-1;
		int count=0;
		int loopcount=0;
		
		for(int i=0;i<=s/2;i++)
		{ 
			loopcount++;
			if(arr[i]==arr[s-i])
				count++;
		}
		if(count==loopcount)
			return true;
		return false;
	}
	
//	public static boolean palindrome(int arr[]) {
//	    int s = arr.length - 1;
//	    for (int i = 0; i <= s / 2; i++) {
//	        if (arr[i] != arr[s - i]) {
//	            return false; // Ek bhi mismatch mila toh yahin se khatam
//	        }
//	    }
//	    return true; // Sab sahi mila toh palindrome hai
//	}
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 // int arr[]= {9,0,0,9};
    //int arr[]= {'r','a','d','a','r'};
    int arr[]= {'r','a','d','a','r','w'};
    String q="nayan";
//    String q="nayana";

   char str[]=q.toCharArray();


//
//   boolean res =palindrome(arr);
//	if(res==true)
//	System.out.println("given elements are palindrome.. ");
//	else
//		System.out.println("given elements are not palindrome.. ");
  
	boolean res =palindrome(str);
	if(res==true)
	System.out.println("given elements are palindrome.. ");
	else
		System.out.println("given elements are not palindrome.. ");


}
//	int temp = num, rev = 0;
//	while(temp > 0) {
//	    rev = rev * 10 + (temp % 10);
//	    temp /= 10;
//	}
//	return original == rev;

	
}