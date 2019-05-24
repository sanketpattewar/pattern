package javascriptExecutor;

import java.sql.Array;
import java.util.Iterator;

public class StringManipulation {
	
	
	
	public static void main(String[]args) {
		
          String S ="rohan_kotalwar";
          char [] ch = {'r','a','m','e','s','h','w','a','r'};
          
          String s2 = new String(ch);
          String s3 = new String("NarendraModi");
          
          System.out.println(S);
          System.out.println(s2);
          System.out.println(s3);
		  System.out.println("Lenth of s3 is:"+ s3.length());
		  
   System.out.println("********************************************************");       
          
          String [] ss =  S.split("_");
          for(String sss :ss) 
          {
          System.out.println(ss[0]);
          }
          
  System.out.println("**************************************************************");        
          
      
          String name = "Rohankotalwar"; 
          
          for(int i=0 ;i<name.length();i++) 
          {
        	  
        	System.out.println(name.charAt(i));
        	  
          }
          

  System.out.println("**************************************************************");        
                  
  
          String name1 = "rameshwarkotalwar";
          
           char [] array= name1.toCharArray();
      
           
           for(int i=0 ;i<name1.length();i++) 
           {
                System.out.println(array[i]);
           }
           
  System.out.println("**************************************************************");             
           
  
         String[] ss1 =  S.split("_");
         
         
	}
 
}
