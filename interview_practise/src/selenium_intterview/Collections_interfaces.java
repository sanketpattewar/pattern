package selenium_intterview;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Collections_interfaces {
	
public static	WebDriver driver ;
	public static void main(String[]args) {
	//arraylist extends abstract list and implements list implements
		//array list class contain duplicate elements
		//ArrayList<String> list1 = new ArrayList<String>();
		//System.out.println(list1);
		
		/*
		list1.add("rohan1");
		list1.add("rohan2");
		list1.add("rohan3");
		list1.add("rohan4");
		
        //list1.add(1,"mukesh");// it add the mukesh at index postion of 1 in array
		//System.out.println(list1);
		Iterator itr= list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	*/
		
		/*LinkedList<String> list1 = new LinkedList<String>();
		list1.add("rohan");
		list1.add("rohan1");
		list1.add("rohan2");
		list1.add("rohan3");
		
		
		Iterator itr= list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

}*//*
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("salman");
		list2.add("shahrukh");
		list2.add("john");
		// add the all elements of list2 into list1
		
		list1.addAll(list2);
		System.out.println(" by adding elemnts of list1 and list2 :"+list1);
		*/
	
//***********************************LinkedList**************************************************		
		
	LinkedList<String>L1 = new LinkedList<String>();
	
	L1.add("ashwin");
	L1.add("ashwin2");
	L1.add("ashwin3");
	L1.add("ashwin4");
	L1.add("ashwin5");
	
	System.out.println(L1);
     
	 Iterator<String> itr =L1.iterator();
	 while(itr.hasNext()) {
		 
		 System.out.println(itr.next());
	 }
	 
	 //add "mohit" at index position of 1 
	 
L1.add(1,"mohit");

System.out.println(L1);
	
// add "john" at first position in a list

L1.addFirst("john");


// add "akon" at last position
 L1.addLast("akon");
 
 // again iterate the elements
 Iterator<String> itr1 =L1.iterator();
  while(itr1.hasNext()) {
	  System.out.println(itr1.next());
  }
  
// remove the element at 4 location
   L1.remove(4);
   
   System.out.println("list of elements"+L1);
 // you can remove first as well as last element to in linkedlsit
   
   L1.removeFirst();
   L1.removeLast();
   
   System.out.println(L1);
   
 /***************************************HASHSET CLASSS*/
  /* HashSet<String> set1=new HashSet<String>();  
   set1.add("One");                              HERE OUT PUT WILL BE LAST ELEMENT RETUENS FIRST 
                                                   THEN FIRST ELEMNT RETURNS AFTER THAT LASTBUT ONE ELEMENT RETURN 
   set1.add("Two");    
   set1.add("Three");   
   set1.add("Four");  
   set1.add("Five");  
   Iterator<String> i=set1.iterator();  
   while(i.hasNext())  
   {  
   System.out.println(i.next());  
   }  
     */
   
   // HERE HASHSET CLASS DOES NOT ALLOW DUPLICATE ELEMENT
   
  /* HashSet<String> set=new HashSet<String>(); 
   set.add("Ravi");  
   set.add("Vijay");  
   set.add("Ravi");  
   set.add("Ajay");  
   //Traversing elements  
   
   Iterator<String> itr9=set.iterator();  
   while(itr9.hasNext()){  
    System.out.println(itr9.next());  
   
 
  
   }  
   */
   
   ArrayList<String> list3= new ArrayList<String>();
   list3.add("Ravi");  
   list3.add("Vijay");  
   list3.add("Ravi");  
   list3.add("Ajay");  
   
   int n =list3.size();
   for(int i=0 ; i< n ; i++) {
	   
	   System.out.println(list3.get(i));
   }
  System.out.println( list3.get(3));
   
 //*********************************************Hashmapp**************************************************//  
 HashMap<Integer,String>map = new HashMap<Integer,String>();
 map.put(101,"rohan");
 
 //adding the elements into the map using the put method
 
 map.put(102,"rahul");
 map.put(103, "rehan");
 map.put(104,"rajesh");
 
 System.out.println(map);
 
 for(Map.Entry a :map.entrySet()) {
	 System.out.println(a.getKey()+ ""+ a.getValue());
	 
	 
 }
 
  
  
  }
}
