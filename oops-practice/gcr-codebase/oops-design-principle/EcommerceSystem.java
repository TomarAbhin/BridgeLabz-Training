import java.util.*;
class Product {     //product class(can exist independently)
    String productName;
    double price;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}
class Order {    //order class(aggregates Products)
    int orderId;
    ArrayList<Product> products = new ArrayList<>();
    Order(int orderId) {
        this.orderId = orderId;
    }
    void addProduct(Product product) {
        products.add(product);
    }
    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("  " + p.productName + " -Rs " + p.price);
        }
        System.out.println("Total Amount: Rs " + calculateTotal());
    }
}

class Customer {       //c1 class(associated with Order)
    String name;
    int customerId;
    ArrayList<Order> orders = new ArrayList<>();
    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }
    void placeOrder(Order order) {
        orders.add(order);
    }
    void displayCustomerDetails() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
        System.out.println("Orders Placed:");
        for (Order o : orders) {
            o.displayOrderDetails();
            System.out.println();
        }
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        //creating products
        Product p1 = new Product("Mobile Phone", 35000);
        Product p2 = new Product("Printer", 8000);
        Product p3 = new Product("Keyboard", 2500);
        //creating order
        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);
        //creating customer
        Customer c1 = new Customer("Rahul", 1);
        //customer places order
        c1.placeOrder(order1);
        c1.displayCustomerDetails();
    }
}
