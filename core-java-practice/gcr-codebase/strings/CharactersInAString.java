import java.util.*;
public class CharactersInAString {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string:");
        String st=s.nextLine();    // input the string
        char[] ans=CharactersInString(st);   // calling the method
        System.out.println("characters in the string are: "+Arrays.toString(ans));
        char[] ansUsingFunction=st.toCharArray();   // using built in function
        boolean res=compareTwoArray(ans,ansUsingFunction);    //comparing both the char arrays
        if(res){
            System.out.println("character arrays from both methods are same.");

        }else{
            System.out.println("character arrays form both the methods are not same.");
        }

    }
    public static char[] CharactersInString(String st){    //method to extract characters from string
        char[] ch=new char[st.length()];   
        for(int i=0;i<st.length();i++){ 
            ch[i]=st.charAt(i);  
        }
        return ch;

    }
    public static boolean compareTwoArray(char[] ch1,char[] ch2){   // method for comparing two char arrays
        if(ch1.length!=ch2.length){
            return false;
        }
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}
