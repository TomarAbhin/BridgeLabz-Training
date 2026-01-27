package lambda_expression;

import java.util.*;

public class SortingInECommerce {
	
	//class
    static class Product {
        String name;
        double price;
        double rating;
        double discount;

        Product(String name, double price, double rating, double discount) {
            this.name = name;
            this.price = price;
            this.rating = rating;
            this.discount = discount;
        }

        public String toString() {
            return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
        }
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 15));
        products.add(new Product("Headphones", 3000, 4.2, 25));
        products.add(new Product("Tablet", 25000, 4.3, 20));

        Scanner sc = new Scanner(System.in);

        System.out.println("Sort Products By:");
        System.out.println("1. Price");
        System.out.println("2. Rating");
        System.out.println("3. Discount");

        int choice = sc.nextInt();

        //dynamic sorting using lambda and Comparator
        switch (choice) {
            case 1:
                products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
                break;
            case 2:
                products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
                break;
            case 3:
                products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\nSorted Products:");
        products.forEach(System.out::println);

    }
}
