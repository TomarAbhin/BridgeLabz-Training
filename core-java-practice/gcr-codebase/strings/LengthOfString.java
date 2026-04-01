import java.util.*;
public class LengthOfString {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string: ");
        String st=s.next();
        int ans=lengthOfString(st);
        int ansUsingFunction=st.length();
        System.out.println("length of string using built-in function is: "+ansUsingFunction+" and using user defined method is: "+ans);

    }
    public static int lengthOfString(String st){
         int count = 0;

        try {
            while (true) {  // Infinite loop
                st.charAt(count); // accessing each character
                count++;            // increment the counter
            }
        } catch (StringIndexOutOfBoundsException e) {   // Exception occurs when index exceeds string length
            return count;
        }


    }
}
