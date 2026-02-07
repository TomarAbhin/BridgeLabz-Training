package FlipKey;

import java.util.*;

public class FlipKey {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input=s.next();
		String invert=cleanseAndInvert(input);
		System.out.println("The generated key is: "+invert);
	}

	
	public static String cleanseAndInvert(String input) {
		if(input.length()<6 || input==null) {
			return "";
		} 
		
		if(!(input.matches("^[a-zA-Z]+$"))) {
			return "";
		}
		
		
		
			String lowerCase=input.toLowerCase();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<lowerCase.length();i++) {
				if(lowerCase.charAt(i)%2!=0) {
					sb.append(lowerCase.charAt(i));
				}
				
			}
			
			String reverse=sb.reverse().toString();
			StringBuilder result=new StringBuilder();
			for(int i=0;i<reverse.length();i++) {
				if(i%2==0) {
					result.append(Character.toUpperCase(reverse.charAt(i)));
				}else {
					result.append(reverse.charAt(i));
				}
			}
			return result.toString();
	}
}
