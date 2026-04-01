import java.util.*;
public class SplitTheString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the st: ");
        String st = s.nextLine();   // input the string
        String[] ans = splitUsingCharAt(st);  // calling the method
        String[] ansUsingFunction = st.split(" ");  // splitting using built-in function
        boolean result = compareStringArrays(ans, ansUsingFunction);  // comparing both the arrays
        System.out.println("output using user-defined method:");
        for (String st1 : ans) {
            System.out.println(st1);
        }

        System.out.println("output using split() method:");
        for (String str : ansUsingFunction) {
            System.out.println(str);
        }
        if (result) {
            System.out.println("Both methods give the same result");
        } else {
            System.out.println("Both methods give different results");
        }
    }
    public static int findLength(String st) {   //method for finding length
        int count = 0;   
        try {
            while (true) {
                st.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    } 
    public static String[] splitUsingCharAt(String st) {   // Method to split st into words using charAt()

        int length = findLength(st);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (st.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIdx = new int[wordCount + 1];
        int idx = 1;
        spaceIdx[0] = -1;

        for (int i = 0; i < length; i++) {
            if (st.charAt(i) == ' ') {
                spaceIdx[idx++] = i;
            }
        }
        spaceIdx[idx] = length;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIdx[i] + 1; j < spaceIdx[i + 1]; j++) {
                word = word + st.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }
}

