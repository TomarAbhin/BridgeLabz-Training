package com.example.demo;

public class StringUtils {
    //function to reverse a string
    public String reverseString(String str) {
        char[] ch =str.toCharArray();
        String reversed ="";
        //loop from end to start
        for (int i=ch.length-1;i>=0;i--) {
            reversed=reversed+ch[i];
        }
        return reversed;
    }

    //function to check palindrome or not
    public boolean isPalindrome(String str) {
        int start =0;
        int end =str.length() - 1;
        while (start < end) {
            if (str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //function to convert string to uppercase
    public String toUpperCase(String str) {
        char[] ch = str.toCharArray();
        String ans = "";
        for (int i=0;i<ch.length;i++) {
            //ASCII difference between lowercase and uppercase is 32
            if (ch[i]>='a' && ch[i]<='z') {
                ans=ans+(char)(ch[i] - 32);
            } else {
            	ans=ans+ch[i];
            }
        }
        return ans;
    }
}
