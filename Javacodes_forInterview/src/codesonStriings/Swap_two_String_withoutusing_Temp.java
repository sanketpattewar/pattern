package codesonStriings;

public class Swap_two_String_withoutusing_Temp {

	public static void main(String[] args) {
		
	//********** swapping without using third variable
	  String a ="Hello" ;
	  String b ="World" ;
	  
	
	  a=a+b;          //it returns String "HelloWorld".
	  System.out.println(a);
	  
	   
	 b= a.substring(0,a.length()-b.length());  //  b =hello
	 
	 System.out.println(b);
	 
	 a =a.substring(b.length());    // a=world
	 
	  System.out.println(a);
	  
	  System.out.println("now a="+a+" and "+" b="+b );
	
	  
	  

	}

}
