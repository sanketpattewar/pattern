package codesonStriings;

public class Frequency_of_character_IN_String {
	
	public static void main(String[]args) {
		
		String s = "rameshwar_kotalwar";
		char  c = 'a';
		int frequency = 0 ;
		
		int len =s.length();
		
		for(int i=0 ;i<len ;i++) {
			
			if(s.charAt(i)== c) {
				
				++ frequency ;
			
			
		}
		
		System.out.println("Here "+c+" comes "+frequency +" Times");
	}

	}
}
