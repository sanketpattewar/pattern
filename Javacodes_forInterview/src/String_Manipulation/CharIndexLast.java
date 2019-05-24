package String_Manipulation;

public class CharIndexLast {

	public static void main(String[] args) {
		
		//charAt(), indexOf() & lastIndexOf()
		
		String text = "automatedscript";
		
		int index = text.charAt(5);
		char ch = text.charAt(5);
		
		int indexOf = text.indexOf('a');
		int lastIndexOf = text.lastIndexOf('a');
				
		System.out.println("ASCII value : " + index);
		System.out.println("Value for index '5' is : "+ ch);
		
		System.out.println("\nFirst index of 'e' : " + indexOf);
		System.out.println("Last index of 'e' : " + lastIndexOf);

	}

}
