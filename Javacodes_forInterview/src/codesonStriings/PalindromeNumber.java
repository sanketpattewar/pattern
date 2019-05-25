package codesonStriings;

public class PalindromeNumber {

	public static void main(String[] args) {
	
	//if reverse of number is same as given number  then it is called as palidrome number
	//ex: num given:1221 reverse of number is :1221  so both are same , it is called as palidrome number
	// program is same as reverse number	
		int num =1223 ;
		int rev =0 ;
		
		int t=num ; // t become given number
		
		while (num>0)
		{
			rev = rev*10 +num%10 ;
			num=num/10;
					
		}
		if (t==rev) {
			System.out.println("given number is palidrom number");
		}
		
		else {
			
			System.out.println("given number is not palidrome number");
			
		}
		
		
	}

}
