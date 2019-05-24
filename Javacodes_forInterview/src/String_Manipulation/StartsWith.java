package String_Manipulation;

public class StartsWith {

	public static void main(String[] args) {
		// startsWith() & endsWith()
		
		String text = "automatedscript";
		 
		boolean start = text.startsWith("auto");
		boolean end = text.endsWith("cript");
		
		boolean start_case = text.startsWith("aUto");
		boolean end_case = text.endsWith("Script");
 
		System.out.println("true - the content is available in the string");
		System.out.println("false - the content is not available in the string\n");
		
		System.out.println(start);
		System.out.println(end);
		
		System.out.println(start_case);
		System.out.println(end_case);

	}

}
