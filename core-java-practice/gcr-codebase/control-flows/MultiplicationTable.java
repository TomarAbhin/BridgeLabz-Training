import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();   // input the num 
        for(int i=6;i<=10;i+=3){  
            int ans=num*i;   // multiply num with i
            System.out.println(num+" x "+i+" = "+ans);   // print the ans
        }
    }
}
