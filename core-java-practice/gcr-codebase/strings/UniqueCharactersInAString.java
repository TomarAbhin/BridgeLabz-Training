import java.util.*;
public class UniqueCharactersInAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();
        int length = findLength(st);
        char[] unique = findCharacters(st, length);
        System.out.print("Unique characters: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
    }
    public static int findLength(String st) {    // Find length without using length()
        int count = 0;
        try {
            while (true) {
                st.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }
    public static char[] findCharacters(String st, int length) {        // Find unique characters using nested loops
        char[] temp = new char[length];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            char current = st.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == st.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[idx++] = current;
            }
        }
        char[] ans = new char[idx];
        for (int i = 0; i < idx; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}


