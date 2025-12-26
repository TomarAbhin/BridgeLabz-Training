import java.util.*;
class Product {     // Product class
    String name;
    double quantity;
    double pricePerUnit;
    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    double getCost() {
        return quantity * pricePerUnit;
    }
}

class Customer {     //customer class
    String name;
    ArrayList<Product> products = new ArrayList<>();
    Customer(String name) {
        this.name = name;
    }
    void addProduct(Product product) {
        products.add(product);
    }
    ArrayList<Product> getProducts() {
        return products;
    }
}

class BillGenerator {     //billGenerator class
    static double generateBill(Customer customer) {
        double total = 0;
        System.out.println("Customer: " + customer.name);
        System.out.println("Purchased Items:");
        for (Product p : customer.getProducts()) {
            double cost = p.getCost();
            total += cost;
            System.out.println(
                p.name + " - " + p.quantity + " units @ Rs" + p.pricePerUnit + " = Rs" + cost
            );
        }
        return total;
    }
}

public class GroceryStoreBillGenerator {
    public static void main(String[] args) {
        //creating customer
        Customer customer = new Customer("Alice");
        //creating products
        Product bread = new Product("Bread", 2, 4);   
        Product milk = new Product("Milk", 1, 2);     
    
        customer.addProduct(bread);
        customer.addProduct(milk);

        //bill generation sequence
        double totalAmount = BillGenerator.generateBill(customer);

        System.out.println("Total Bill Amount: Rs" + totalAmount);
    }
}
