import java.util.*;
public class EligibleToVoteOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int age=s.nextInt(); // input the age of the person
        if(age>=18){
            System.out.println("the person age is: "+age+" and can vote");
        }else{
            System.out.println("the person age is: "+age+" and cannot vote");
        }
    }
    
}
