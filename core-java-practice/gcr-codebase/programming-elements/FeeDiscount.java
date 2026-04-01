public class FeeDiscount {
    public static void main(String[] args) {
        int fees = 125000; // input fees of the course
        int discount = 10; // input discount percentage
        int discountAmount = (fees * discount) / 100; // calculate discounted amount
        int newFees = fees - discountAmount; // calculate final fees after discount
        System.out.println("the discount amount is: " + discountAmount + " rs and the final fees after discount is: " + newFees + " rs");
    }
    
}
