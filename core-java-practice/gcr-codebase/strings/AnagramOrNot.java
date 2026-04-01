import java.util.*;
public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the first string: ");
        String str = s.nextLine();
        System.out.print("enter the second string: ");
        String str2 = s.nextLine();
        boolean result = isAnagram(str, str2);
        if (result){
            System.out.println("The given strings are anagrams");
        }else{
            System.out.println("The given strings are not anagrams");
        }
    }

    public static boolean isAnagram(String t1, String t2) {     // Method to check whether two texts are anagrams

        t1 = t1.replace(" ", "").toLowerCase();   // remove spaces
        t2 = t2.replace(" ", "").toLowerCase();
        if (t1.length() != t2.length()){
            return false;
        }
        int[] freq1 = new int[256];    // frequency array
        int[] freq2 = new int[256];

        for (int i = 0; i < t1.length(); i++) {
            freq1[t1.charAt(i)]++;
            freq2[t2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i])
                return false;
        }

        return true;
    }
}
