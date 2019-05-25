package codesonStriings;

public class Armstrong_Number {
	
	
	// number is number is amstrong number if 
	// suppoese number is  num =123 then  1*1*1*+2*2*2+3*3*3 = 123 
	// then number is called as amstring number
	
	public static void AmstrongNumber(int num) {
		
		int t =num ;
		int r ;
		int sum =0;
		
		          while(num>0) {
		        	  
		        	 r=num%10;   
		        	 sum= sum +(r*r*r);
		        	 num=num/10;
		        	 
		          }
		          
		         if (t==sum) {
		        	 System.out.println("**number is amstrong Number**");
		         }
		         else {
		        	 System.out.println("**number is not amstrong number**");
		         }
		
    		       
		
	}
	
	public static void main(String[]args) {
		
		AmstrongNumber(407);
		
		
		
		
	}

}
