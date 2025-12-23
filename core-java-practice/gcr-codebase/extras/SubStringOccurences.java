import java.util.*;
public class SubStringOccurences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String st = s.nextLine();    // input the string

        System.out.print("Enter the substring to search: ");
        String sub = s.nextLine();  //input the substring which you want to search

        int count = 0;
        for (int i = 0; i <= st.length() - sub.length(); i++) {
            if (st.substring(i, i + sub.length()).equals(sub)) {     // Check substring match
                count++;
            }
        }
        System.out.println("Substring occurs " + count + " times.");

    }
}


