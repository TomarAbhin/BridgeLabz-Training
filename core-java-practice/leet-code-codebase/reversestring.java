import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); 
        // Initialize an empty string to store the reversed result
        String reversed = "";
        
        //reverse loop from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); //add the reversed charcters one by one in reversed empty string
        }
        
        
        System.out.println("Reversed string is: " + reversed);
    }
}
    
     

