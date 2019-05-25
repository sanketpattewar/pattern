package String_Manipulation;

public class CompareTo {
	
public static void main(String args[]) {
	
	// compareTo() & compareToIgnoreCase()
		
		String text = "automatedscript";
		
		int val1 = text.compareTo("automatedscript");
		int val2 = text.compareTo("Automatedscript");
		int val3 = text.compareToIgnoreCase("automatedSCRIPT");
		
		System.out.println("If value is 0, both are equal. Otherwise not equal.");
 
		System.out.println("\n" + val1);
		System.out.println(val2);
		System.out.println(val3);
	}

}
