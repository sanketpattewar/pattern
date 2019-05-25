package String_Manipulation;

public class UpperLower {
	
	public static void main(String args[]) {
		
		//toUpperCase(), toLowerCase() & toCharArray()
		String s = "class jupiter.com.google.login.Google_Login_Test";
		
		String [] para = s.split("_");
		for(int j =0; j< para.length;j++){
			if(j == 0){
				String s1 = para[j];
				String [] para1 = s1.split(".");
				for(int k =0; k< para1.length;k++){
					System.out.println(para1[k]);
				}
			}
			
		}
		String text = "automatedscript";
 
		String str1 = text.toUpperCase();
		String str2 = str1.toLowerCase();
		
		char[] charArray = text.toCharArray();
		
		System.out.println(str1);
		System.out.println(str2);
		
		for(int i=0; i<charArray.length; i++) {
			
			System.out.print(charArray[i] + " ");
		}
	}

}
