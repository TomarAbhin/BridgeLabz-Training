import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    String getCustomer() {
        return customer;
    }

    double getAmount() {
        return amount;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Abhinav", 1200),
                new Order("Abhay", 800),
                new Order("Kartik", 300),
                new Order("Nystha", 700),
                new Order("Jojo", 1500)
        );

        Map<String, Double> revenueSummary =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomer,
                              Collectors.summingDouble(Order::getAmount)
                      ));

        revenueSummary.forEach((k, v) ->
                System.out.println(k + " -> " + v)
        );
    }
}
