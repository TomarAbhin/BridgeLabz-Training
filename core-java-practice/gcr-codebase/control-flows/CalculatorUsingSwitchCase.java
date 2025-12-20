import java.util.*;
public class CalculatorUsingSwitchCase {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter first number: ");
            double num1 = s.nextDouble();

            System.out.println("enter second number: ");
            double num2 = s.nextDouble();

            System.out.println("Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter your choice (1-4): ");
            int choice = s.nextInt();

            // Switch case for calculator
            switch (choice) {
                case 1:
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Result = " + (num1 / num2));
                    } else {
                        System.out.println("Division by zero not allowed");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
