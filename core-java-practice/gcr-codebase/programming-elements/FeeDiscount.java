public class FeeDiscount {
    public static void main(String[] args) {
        int fees = 125000; // input fees of the course
        int dis = 10; // input discount percentage
        int disamount = (fees * dis) / 100; // calculate discounted amount
        int newfees = fees - disamount; // calculate final fees after discount
        System.out.println("the discount amount is: " + disamount + " rs and the final fees after discount is: " + newfees + " rs");
    }
    
}
