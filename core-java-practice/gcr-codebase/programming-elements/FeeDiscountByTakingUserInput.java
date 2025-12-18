import java.util.Scanner;
public class FeeDiscountByTakingUserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the fees: ");
        int fees = s.nextInt(); // input fees of the course
        System.out.println("Enter the discount percent: ");
        int dis = s.nextInt(); // input discount percentage
        int disamount = (fees * dis) / 100; // calculate discounted amount
        int newfees = fees - disamount; // calculate final fees after discount
        System.out.println("the discount amount is: " + disamount + " rs and the final fees after discount is: " + newfees + " rs");
    }
    
}
