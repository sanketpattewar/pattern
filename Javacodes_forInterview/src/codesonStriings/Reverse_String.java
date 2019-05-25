package codesonStriings;
	

public class Reverse_String {

	public static void main(String[]args)  {
		
		
		String s = "SeleniumTesting " ;
		String rev = "" ;    // blank
		

	    int len=s.length();  // here lenth will be 16 but index starts from 0 so index should be upto 15 
	    
	    for(int i=len-1 ;i>=0;i--)
	       {
	    	
	    	rev =rev+s.charAt(i);
	    	
	    	}
	    
	   System.out.println(rev);
      }

   }