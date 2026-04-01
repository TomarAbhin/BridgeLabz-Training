import java.util.*;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();
        String[][] ans = findFrequency(st);
        displayResult(ans);
    }
    public static String[][] findFrequency(String st) {     // Find frequency of characters using ASCII array
        int[] freq = new int[256];
        for (int i = 0; i < st.length(); i++) {
            freq[st.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (freq[st.charAt(i)] > 0)
                count++;
        }
        String[][] ans = new String[count][2];
        int idx = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (freq[ch] > 0) {
                ans[idx][0] = String.valueOf(ch);
                ans[idx][1] = String.valueOf(freq[ch]);
                idx++;
                freq[ch] = 0;    // avoid duplicate entry
            }
        }

        return ans;
    }
    public static void displayResult(String[][] data) {    // Display ans in tabular format

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}


