package String_Manipulation;

public class CodePoint {

	public static void main(String[] args) {
		// codePointAt(), codePointBefore(), codePointCount() & contains()
		
		String text = "automatedscript";
		 
		int codeAt = text.codePointAt(0);
		int codeAtBefore = text.codePointBefore(1);
		int codeCount = text.codePointCount(1, 6);
		boolean contain1 = text.contains("auto");
		boolean contain2 = text.contains("au to");
				
		System.out.println("ASCII value of 'a' : " + codeAt);
		System.out.println("ASCII value of 'a' : " + codeAtBefore);
		System.out.println("Char count is : " + codeCount);
		
		System.out.println("\nCheck the content is " +
				"available in the string or not : " + contain1);
		System.out.println("Check the content is " +
				"available in the string or not : " + contain2);

	}

}
