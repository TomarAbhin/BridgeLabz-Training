package cloning_prototype;

public class PrototypeApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        Product original = new Product(101, "Laptop", 75000);

        Product copy = (Product) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + copy);
    }
}

