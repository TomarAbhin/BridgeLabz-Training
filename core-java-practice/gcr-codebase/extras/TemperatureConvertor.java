import java.util.*;
public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your option (1 or 2): ");
        int option = s.nextInt();

        if (option == 1) {

            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius is: ");
            double celsius = s.nextDouble();

            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        } else if (option == 2) {

            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit is: ");
            double fahrenheit = s.nextDouble();

            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius is: " + celsius);

        } else {
            System.out.println("Invalid option!");
        }

    }

    public static double celsiusToFahrenheit(double celsius) {    // Method to convert Celsius to Fahrenheit
        return (celsius*9/5)+32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {      // Method to convert Fahrenheit to Celsius
        return (fahrenheit-32)*5/9;
    }
}


