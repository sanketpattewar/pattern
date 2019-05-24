package String_Manipulation;

public class SubStringClass {
	
	public static void main(String args[]) {
		
		//substring(), subSequence()
		
		String text = "automatedscript";
 
		String str1 = text.substring(3);
		String str2 = text.substring(3, 8);
		CharSequence str3 = text.subSequence(3, 8);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
