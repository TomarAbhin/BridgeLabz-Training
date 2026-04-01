import java.util.*;
public class EligibilityOfVoting {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();   // size of array
        int[] ages = new int[n];   // intialize the array of ages of the people
        System.out.println("Enter the ages of the people:");
        for(int i=0; i<n; i++){    // input the ages
            ages[i] = s.nextInt();
        }
        for(int age : ages){
            if(age >= 18){    //check the eligibility
                System.out.println("Age is: " + age + " And is Eligible to vote");
            } else {
                System.out.println("Age is: " + age + " And Not eligible to vote");
            }
        }
        
    }
}
