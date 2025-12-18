import java.util.*;
public class TotalPrice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double price = s.nextDouble(); // price of the individual item
        double quantity = s.nextDouble(); // quantity of the item
        double totalprice = price * quantity; // calculate the total price 
        System.out.println("the total purchase price is: "+totalprice+ " if the quantity is: "+quantity+" and the price is: "+price);
    }
    
}
