import java.util.*;
public class FactorsInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num :");  
        int num = s.nextInt();  // Input num from user
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[idx++] = i;
            }
        }
        System.out.println("The factors of " + num + " are:");
        System.out.println(Arrays.toString(factors));
    }
    
}
