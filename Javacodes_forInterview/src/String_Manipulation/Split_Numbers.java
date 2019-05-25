package String_Manipulation;

public class Split_Numbers {
	
	public static void main(String[]args) {
	         String S ="SELENIUMTESTING" ;
	         
	     String[] S1 =   S.split("U"); 
	     
	      String S2 = S1[1] ;
	      String rev="";   
	      int len = S2.length();
	      
	      for(int i=len-1 ; i>=0 ;i--) {
	    	  
	    	  
	    	  rev = rev +S2.charAt(i);
	      }
	      System.out.println(rev);
	      
	      
	         
	       
	         

}
}