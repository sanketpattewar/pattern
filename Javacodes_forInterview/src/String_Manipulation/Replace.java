package String_Manipulation;

public class Replace {

	public static void main(String args[]) {
		
		// replace(), replaceAll() & replaceFirst()
		
		String text = "automatedscript";
 
		String str1 = text.replace('a', 'A');
		String str2 = text.replaceAll(text, "Hello Selenium Hello");
		String str3 = str2.replaceFirst("Hello", "Java");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
