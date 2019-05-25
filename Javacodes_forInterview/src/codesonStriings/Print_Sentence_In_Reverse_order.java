package codesonStriings;

public class Print_Sentence_In_Reverse_order {

	
	public static void main(String[]args) {
		
		String Senetence = "My name is rohan";
		
		
		
		
		String [] rev =Senetence.split(" ");
		
		int len =rev.length;
		
		System.out.println(len);
		
	         for(int i =rev.length-1 ; i>=0 ;i--) {
	        	 
	        	      System.out.print(rev[i]+" ");
	        	 
	         }
	}
	
}


