public class ProductInventory {

    static class Product {
        // initalizing instance variables
        String productName;
        double price;

        static int totalProducts = 0;

        // Constructor
        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++; // increment count when a product is created
        }

        void display() {  // method to display product details
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
        }

        static void displayTotalProducts() {   // method to display total products
            System.out.println("Total Products Created: " + totalProducts);
        }
    }
    public static void main(String[] args) {
        // create product objects 
        Product product1 = new Product("Mouse", 550.0);
        Product product2 = new Product("Mobile Phone", 30000.0);
        Product product3 = new Product("Keyboard", 2000.0);
        product1.display();

        product2.display();

        product3.display();
     
        Product.displayTotalProducts();
    }
}


