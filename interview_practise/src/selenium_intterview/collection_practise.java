package selenium_intterview;

import java.util.ArrayList;
import java.util.Iterator;

public class collection_practise {

	public static void main(String[] args) {
	
		/*
		for(int i=1 ;i<7 ;i++) {
			
			for (int j=7;j>i;j-- ) {
				
				System.out.print(" ");
			}
			   for(int k=1 ;k<=i ;k++) {
				   
				   System.out.print(k+" ");
			   }
			
			System.out.println();
		}*/
		
	/*	
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<7 ;i++) {
			list.add(i+1);
		}
		*/
		
       /*           // System.out.println(  list.get(0)) ;
		Iterator itr= list.iterator();
		while(itr.hasNext()) {
			int i =(int) itr.next();
			
			if(i%2!=0) 
				itr.remove();
			
		}
		*/
		
		String VALUE = "KNOWLEDGE";
		
		char a = VALUE.charAt(3);
		 System.out.println(a);
	String[] abc =VALUE.split("",4);
	System.out.println(abc);
	
		 for(int i=4 ;i<VALUE.length();i++){
			 
		
			System.out.println(VALUE.charAt(i));
		 }
	}


}
