import java.util.*;
public class CheckTwoSetsAreEqual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //input the values for set 1
        System.out.print("enter number of elements in Set 1: ");
        int n1 = s.nextInt();

        Set<Integer> set1 = new HashSet<>();
        System.out.println("enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(s.nextInt());
        }

        //input the values for set 2
        System.out.print("enter number of elements in Set 2: ");
        int n2 = s.nextInt();

        Set<Integer> set2 = new HashSet<>();
        System.out.println("enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(s.nextInt());
        }

        //checking if sets are equal or not
        boolean isEqual = set1.equals(set2);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Are both sets equal? " + isEqual);
        
    }
}


