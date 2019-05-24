package String_Manipulation;

public class ConcatString {

	public static void main(String[] args) {
		
		String text1 = "automatedscript";
		String text2 = "com";
		
		String ans1 = "automatedscript".concat(".").concat("com");
		String ans2 = text1.concat(".").concat("com");
		String ans3 = text1.concat(".").concat(text2);
		String ans4 = text1 + "." + text2;
		
		System.out.println(ans1);
		System.out.println(ans2);		
		System.out.println(ans3);		
		System.out.println(ans4);	

	}

}
