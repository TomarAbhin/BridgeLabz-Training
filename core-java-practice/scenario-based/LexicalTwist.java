import java.util.*;

public class LexicalTwist {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the text: ");
		String st=s.nextLine();
		String reversed="";
		System.out.print("Enter the second word: ");
		String st2=s.nextLine();
		if(st.contains(" ")) {
			System.out.println("Invalid input.");
			return;
		}
		
		if(st2.contains(" ")) {
			System.out.println("Invalid Input.");
			return;
		}
		
		for(int i=st.length()-1;i>=0;i--) {
			reversed+=st.charAt(i);
		}
		//System.out.println(reversed);
		String transformed="";
		
		if(st2.equalsIgnoreCase(reversed)) {
			st=reversed.toLowerCase();
			for(int i=0;i<st.length();i++) {
				char ch=st.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					transformed+='@';
				}else {
					transformed+=ch;
				}
			}
			System.out.println("Transformed word: "+transformed);
			//System.out.println("Second word is the reversed version of the first.");
		}else {
			String joined=st.concat(st2);
			joined=joined.toUpperCase();
			System.out.println("New combined word is: "+joined);
			int vowelCount=0;
			int consonantCount=0;
			//int count=0;
			
			for(char ch:joined.toCharArray()) {
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ) {
					vowelCount++;
				}else {
					consonantCount++;
				}
			}
			System.out.println("Vowel Count: "+vowelCount);
			System.out.println("Consonant Count: "+consonantCount);
			
			if(vowelCount>consonantCount) {
				String onlyVowel="";
					for(char c:joined.toCharArray()) {
						if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'  ) {
							onlyVowel+=c;
							//count++;
						}
						
						if(onlyVowel.length()==2) break;
					}
				System.out.println(onlyVowel);
				
			}else if(vowelCount<consonantCount){
				String onlyConsonant="";
				for(char c:joined.toCharArray()) {
					if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'  ) {
						//onlyConsonant+=c;
						continue;
					}else {
						onlyConsonant+=c;
					}
					
					if(onlyConsonant.length()==2) break;
					
				}
				System.out.println(onlyConsonant);
			}else {
				System.out.println("Vowels And Consonants are equal.");
			}
			
			
			//System.out.println("Second word is not the reversed word of the first.");
		}
	}

}
