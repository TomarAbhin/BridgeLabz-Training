interface Discountable {   //interface for discount functionality
    double applyDiscount(double totalAmount);
    String getDiscountDetails();
}
//abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    //constructor using encapsulation
    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    //getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //concrete method
    void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: Rs" + price);
        System.out.println("Quantity: " + quantity);
    }

    //abstract method
    abstract double calculateTotalPrice();
}

//vegItem subclass
class VegItem extends FoodItem implements Discountable {
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.90; // 10% discount
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}

//nonvegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    private static final double EXTRA_CHARGE = 50.0;
    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.95; // 5% discount
    }

    public String getDiscountDetails() {
        return "5% discount + Non-Veg Extra Charge Rs50";
    }
}

public class OnlineFoodDeliverySystem {

    //polymorphic order processing method
    static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();
        System.out.println("Total before discount: Rs" + total);
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            total = d.applyDiscount(total);
            System.out.println(d.getDiscountDetails());
        }

        System.out.println("Final Payable Amount: Rs" + total);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Mutton Nihari", 400, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        processOrder(item1);
        processOrder(item2);
    }
}
