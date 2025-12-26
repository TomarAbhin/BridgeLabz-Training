import java.util.*;

interface Taxable {   //interface for tax-related things
    double calculateTax();
    String getTaxDetails();
}
//abstract product class
abstract class Product {
    private int productId;     // encapsulated
    private String name;
    protected double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    //getters and setters 
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    //concrete method
    void getProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: Rs" + price);
    }

    //abstract method
    abstract double calculateDiscount();
}

//electronics subclass
class Electronics extends Product implements Taxable {
    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }
    double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    public double calculateTax() {
        return price * 0.18; // 18% GST
    }

    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}

//clothing subclass
class Clothing extends Product implements Taxable {
    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }
    double calculateDiscount() {
        return price * 0.20; // 20% discount
    }
    public double calculateTax() {
        return price * 0.05; // 5% GST
    }
    public String getTaxDetails() {
        return "Clothing GST: 5%";
    }
}

//grocery subclass
class Groceries extends Product {
    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}

public class Ecommerce {

    //polymorphic method
    static void printFinalPrice(Product product) {
        product.getProductDetails();
        double discount = product.calculateDiscount();
        double tax = 0;
        if (product instanceof Taxable) {
            Taxable t = (Taxable) product;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
        }

        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Discount: Rs" + discount);
        System.out.println("Tax: Rs" + tax);
        System.out.println("Final Price: Rs" + finalPrice);

    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice (5kg)", 500));

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}
