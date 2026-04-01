package stock;

import java.util.*;

public class Stock {

    public static void main(String[] args) {

        List<Double> stockPrices = List.of(1023.50,1018.75,1035.20,1040.10,1029.60);

        stockPrices.stream()
                   .forEach(System.out::println); // print stock price updates
    }
}

