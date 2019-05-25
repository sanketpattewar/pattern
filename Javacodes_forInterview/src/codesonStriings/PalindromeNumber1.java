package codesonStriings;

public class PalindromeNumber1 {

	public static void palindromenumber(int num ) {
		
		int t = num ;
		int rev =0 ;
		
		while (num>0) {
			
			rev = rev*10 + num%10 ;
			num =num/10 ;
		 	
		  }
		
		if (t==num) {
			
			System.out.println("number is palindrome number");
		}
		else
		{
			System.out.println("number is not a palindrome");
		}
		
	}
		public static void main(String[]args) {
			
			
			palindromenumber(1251);
		}
		
		
	}

