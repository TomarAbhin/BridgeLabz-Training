import java.util.*;
public class SubStringUsingCharAtMethod {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=s.nextLine();
        int startIdx=s.nextInt();   //enter the startng index from where substring to be started
        int endIdx=s.nextInt();    //enter the ending index from where substring to be ended
        String ans=subStringUsingCharAt(str, startIdx, endIdx);    // calling the method
        System.out.println("substring is:"+ans);
        String ansUsingFunction=str.substring(startIdx,endIdx);   // using inbuilt substring function to create substring
        if(ans.equals(ansUsingFunction)){     //comparing both substrings
            System.out.println("substring from both methods are same.");
        }else{
            System.out.println("substring from both methods are not same.");
        }

    }
    public static String subStringUsingCharAt(String str,int startIdx,int endIdx){    
        String ans="";  //empty string to store the substring
        for(int i=startIdx;i<endIdx;i++){
            ans+=str.charAt(i);    
        }
        return ans;
    }
}
