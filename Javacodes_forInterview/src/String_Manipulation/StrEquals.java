package String_Manipulation;

public class StrEquals {
	
	public static void main(String args[]) {
		
		String text = "automatedscript";
 
		if(text.equals("automatedscript")) 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text.equalsIgnoreCase("auTomatEdsCripT"))
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text.equals("automatedScript")) 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");
		
		if(text == "automatedscript") 
			System.out.println("The Both are Equal");
		else
			System.out.println("The Both are not Equal");

	
	}

}
