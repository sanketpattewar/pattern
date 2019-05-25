package codesonStriings;

public class Prime_Number1 {
	
	
	public  static boolean isprimeNum (int num) {
		
		
		if(num<=1) {
			
			return false ;
			}
		
		
		for(int i=2 ; i<num ;i++) {
			
			 if(num% i==0) {
				return false ;
			}
		}
		
		return true ;
	}
	
	public static void getprimnumbers(int num1) {   // this method returns prime numbers between
		                                            // between 2 and num1
		for (int i=2 ;i<=num1; i++) {
			
			if (isprimeNum(i)) {
				System.out.print(i+" ");
			}
			
		}
		
	}
	public static void main (String[]args) {
		
		System.out.println("given number is prime number:"+isprimeNum(77));
		
		      getprimnumbers(98);
		
		
	}
	

}
