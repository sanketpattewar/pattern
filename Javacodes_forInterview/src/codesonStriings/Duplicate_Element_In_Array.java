package codesonStriings;

import java.util.HashSet;
import java.util.Iterator;

public class Duplicate_Element_In_Array {

	public static void main(String[] args) {

    
		// we are using hashset becoz it does not allows duplicate element 
		
		String [] names = { "java","pearl","ruby","python","php","c#","java"};
		
		
		HashSet<String> set = new HashSet<String>() ;
		
		for(String name : names) {
			                                          //set.add(name) returns true value 
			if(set.add(name)==false) {                              // if value is duplicated that is again come the
			   
			System.out.println("Duplicate value is :"+ name);
		
		}
		
		
		}
		}
		

	}


