import java.util.*;
public class CompareTwoStrings {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first string:");
        String str1=s.nextLine();    // input first string
        System.out.println("enter the second string:");
        String str2=s.nextLine();   // input second string
        boolean result=compareUsingcharAt(str1,str2);  // calling the method
        boolean resultUsingEquals=str1.equals(str2);  // using inbuilt function to compare the strings
        if(resultUsingEquals && result){    // comparing both the results
            System.out.println("both strings are equal");
        }else{
            System.out.println("both strings are not equal");
        }


    }
    public static boolean compareUsingcharAt(String str1,String str2){    // method to compare two strings
        if(str1.length()!=str2.length()){   
            return false;
        }
        for(int i=0;i<str1.length();i++){   
            if(str1.charAt(i)!=str2.charAt(i)){   //comparing characters of both the strings
                return false;
            }
        }
        return true;

    }
}
