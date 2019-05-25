
package codesonStriings;

public class Prime_Number {
	
	public static boolean isprimenum(int num) {
		
		if(num<=1) {
			
			return false ;
		}
		
		for(int i=2 ;i<num ; i++) {
			
			if(num % i==0) {
				
				return false ;
			}
		
			}
		
		return true ;
		
	}
	
	
	public static void main(String[] args) {
		
		 System.out.println("Given number is a prime number:"+isprimenum(121));
		 
		 
	
	}
}