package lambda_expression;

import java.util.*;
import java.util.stream.*;

public class InvoiceCreation {

    static class Invoice {
        int transactionId;

        //constructor used in constructor reference
        Invoice(int transactionId) {
            this.transactionId = transactionId;
        }

        public String toString() {
            return "Invoice generated for Transaction ID: " + transactionId;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> transactionIds = new ArrayList<>();

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Transaction ID " + (i + 1) + ": ");
            transactionIds.add(sc.nextInt());
        }

        //constructor reference to create Invoice objects
        List<Invoice> invoices =transactionIds.stream().map(Invoice::new).collect(Collectors.toList());

        System.out.println("\nGenerated Invoices:");
        invoices.forEach(System.out::println);

    }
}

