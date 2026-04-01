import java.util.Scanner;
public class FeeDiscountByTakingUserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the fees: ");
        int fees = s.nextInt(); // input fees of the course
        System.out.println("Enter the discount percent: ");
        int discount = s.nextInt(); // input discount percentage
        int discountAmount = (fees * discount) / 100; // calculate discounted amount
        int newFees = fees - discountAmount; // calculate final fees after discount
        System.out.println("the discount amount is: " + discountAmount + " rs and the final fees after discount is: " + newFees + " rs");
    }
    
}
