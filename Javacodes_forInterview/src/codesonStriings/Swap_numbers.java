package codesonStriings;

public class Swap_numbers {

	public static void main(String[]args) {
	
	 int x =10 ;
	 int y =20 ;
	 
	 //**Using third variable** 
	 
	 int t ;
	 
	 t=x ;  // t=10
	 
	 x=y ;  //now x=20
	 
	 y=t ; // now y=10

	 
	 
	 System.out.println(x);
	 System.out.println(y);
	 
//**Without Using third Variable**
	 
	  x =x+y ; //x =30 (here now x =30)
	  
	  y =x-y ; //y=10 (here x =30 - y=10 i.e y =10 )
	  x =x-y ; // x =20
	  
			 
	 System.out.println(x);
	 System.out.println(y);
	 
	 
}
}