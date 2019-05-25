package codesonStriings;

public class Can_main_method_overloaded_in_java {

	public static void main(String[] args) 
	{

            System.out.println("main method-1");  // here only first method will print
                                                   // becoz jvm allows only this parameter
            
            main("Selenium");                   // so it is static method directly call
                                                 // it will return second main method
	}
	

	public static void main(String args) 
	{

            System.out.println("main method-2");

	}
	

	public static void main(int a) 
	{

            System.out.println("main method-3");

	}
	

	public static void main(int a, int b) 
	{

            System.out.println("main method-4");

	}

}
