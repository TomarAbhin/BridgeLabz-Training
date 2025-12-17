//package core-java-practice.leet-code-codebase;

import java.util.*;

public class palindrome {
   public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int originalnumber = n;
        int reversed = 0;
        // Loop for checking number till it is greater than 0
        while (n > 0) {
            int digit = n % 10; //for getting last digit of number
            reversed = reversed * 10 + digit; //for reversing the number
            n = n / 10; //for removing the last digit by dividing it 
        }
        // now comparing the original number and reversed number 
        if (originalnumber == reversed) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("number is not a palindrome");
        }
    }
}