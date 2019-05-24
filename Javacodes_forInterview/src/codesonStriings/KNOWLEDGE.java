package codesonStriings;

public class KNOWLEDGE {

	public static void main(String[] args) {
		// 1.first print  = L
		// 2.second print = EDGE
		// 3.Third Print  = WONK
		// 4.Fourth Print =LEDGEWONK
		
		String s = "KNOWLEDGE";
//##########################################################################################	
		
		// 1.first print  = L
		
		char c =s.charAt(4);
		System.out.println("1."+ c);

//##########################################################################################
		
		// 2.second print = EDGE
		
		 String[] c1 = s.split("L");  // after splitting returns c1[0] = KNOW ,c2[1]=EDGE
		 
		 String s1 =c1[1] ;   // here we store edge inside of s1
		 
		 System.out.println("2."+s1);
		 
//##########################################################################################		

		// 3.Third Print  = WONK
		 
		 String s2 = c1[0];
		 
		 System.out.println(s2);  // it returns "KNOW" just reverese it 
		 
		 
		 String rev1="" ;
		 int len1 = s2.length();
		 
		 for(int i=len1-1 ;i>=0 ;i--) {
			 
			   rev1=rev1 +s2.charAt(i);
			 
		 }
		 
		 System.out.println("3."+rev1);  // rev1 = "WONK"
		 
//##########################################################################################			 
		// 4.Fourth Print =LEDGEWONK
		
		 String[] s3 =s.split("W");  // after spliting it returns s3[0]="KNO" ,s3[1]="LEDGE"
		 
		  String s4 =s3[1] ;
		  
		  System.out.println(s4);  // it returns "LEDGE"
		 
		 System.out.println("4."+s4+rev1); // it will be "LEDGEWONK"
		 
		 
		 }

}
