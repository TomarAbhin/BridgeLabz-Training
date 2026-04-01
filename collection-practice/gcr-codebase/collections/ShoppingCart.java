import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //hashMap: product -> price
        Map<String, Double> productPrices = new HashMap<>();
        //linkedHashMap: maintains order of items added to cart
        Map<String, Double> cart = new LinkedHashMap<>();
        System.out.print("enter number of products available: ");
        int n = s.nextInt();

        //input products and prices
        for (int i = 0; i < n; i++) {
            System.out.print("enter product name: ");
            String product = s.next();
            System.out.print("enter product price: ");
            double price = s.nextDouble();
            productPrices.put(product, price);
        }
        System.out.print("\nEnter number of items to add to cart: ");
        int m = s.nextInt();
        //add items to cart
        for (int i = 0; i < m; i++) {
            System.out.print("enter product to add: ");
            String item = s.next();

            if (productPrices.containsKey(item)) {
                cart.put(item, productPrices.get(item));
            } else {
                System.out.println("Product not found!");
            }
        }

        //display cart in order added
        System.out.println("\nCart Items (LinkedHashMap - order added):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : Rs" + entry.getValue());
        }

        //display cart sorted by product name (TreeMap)
        TreeMap<String, Double> sortedByName = new TreeMap<>(cart);
        System.out.println("\nCart Items (TreeMap - sorted by product name):");
        for (Map.Entry<String, Double> entry : sortedByName.entrySet()) {
            System.out.println(entry.getKey() + " : Rs" + entry.getValue());
        }

        //display cart sorted by price
        List<Map.Entry<String, Double>> sortedByPrice = new ArrayList<>(cart.entrySet());
        sortedByPrice.sort(Map.Entry.comparingByValue());

        System.out.println("\nCart Items (Sorted by price):");
         for (Map.Entry<String, Double> entry : sortedByPrice) {
            System.out.println(entry.getKey() + " : Rs" + entry.getValue());
        }
    }
}