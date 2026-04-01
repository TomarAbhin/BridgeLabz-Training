 import java.util.*;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!");
         while(true){
            System.out.print("Enter your coffee choice:\n" +
                            "1. Espresso\n" +
                            "2. Latte\n" +
                            "3. Cappuccino\n" +
                            "4. Exit the shop\n" +
                            "5. mocha\n"+
                            "Your choice: ");
            int choice = s.nextInt();
            if (choice == 5) {
                System.out.println("Thanks for coming to the shop.");
                return;
            }
            System.out.println("Enter quantity: ");
            int quantity = s.nextInt();
            double price = 0.0;
            double gst=0.18;
            switch (choice) {
                // Coffee menu options
                case 1:
                    price =100.0 * quantity;  // Calculate price for Espresso.suppose price is 100 ruppees.
                    System.out.println("----------Bill Details:----------");
                    double totalPrice=price + (price*gst);
                    System.out.println("You ordered " + quantity + " Espresso(s). Total price: " + totalPrice+" rupees");
                    break;
                case 2:
                    price = 120.0 * quantity; // calculate price for latte.suppose price is 120 rupees.
                    System.out.println("----------Bill Details:----------");
                    double totalPrice1=price + (price*gst);
                    System.out.println("You ordered " + quantity + " Latte(s). Total price: " + totalPrice1+" rupees");
                    break;
                case 3:
                    price = 130.0 * quantity; // calculate price for cappuccino.suppose price is 125 rupees.
                    System.out.println("----------Bill Details:----------");
                    System.out.println("You ordered " + quantity + " Cappuccino(s). Total price: " + price+" rupees");
                    break;
                case 4:
                    price= 150.0* quantity; // calculate price for mocha.suppose price is 150 rupees.
                    System.out.println("----------Bill Details:----------");
                    double totalPrice2=price + (price*gst);
                    System.out.println("You ordered " + quantity + " Mocha(s). Total price: " + totalPrice2 +" rupees");
                default:
                    System.out.println("Invalid choice or currently not available.");
            } 
        }

    }
}