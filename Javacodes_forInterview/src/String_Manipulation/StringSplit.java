package String_Manipulation;

public class StringSplit {

	public static void main(String args[]) {
		
		String text = "aaa bbb ccc aaa bbb ccc aaa bbb ccc";
 
		String[] str1 = text.split("aaa");
	
		String[] str2 = text.split("bbb");
		System.out.println();
		for(int i=1; i<str1.length; i++) {
			
			System.out.println(str1[i]);
		}
		
		System.out.println();
		
		for(int i=1; i<str2.length; i++) {
			
			System.out.println(str2[i]);
		}
	}

}
