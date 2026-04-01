import java.util.Scanner;

public class MultiplicationTableUsingArrayFromSixToNine {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] result = new int[4];
        int idx = 0;
        for (int i = 6; i <= 9; i++) {   // Calculate multiplication table from 6 to 9
            result[idx] = number * i;
            idx++;
        }
        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[idx]);   // Display result
            idx++;
        }  
    }
}
