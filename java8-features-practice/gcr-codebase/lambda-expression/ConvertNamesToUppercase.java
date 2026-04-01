package lambda_expression;

import java.util.*;

public class ConvertNamesToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        System.out.println("\nEmployee Names in Uppercase:");

        //method reference used in stream
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
