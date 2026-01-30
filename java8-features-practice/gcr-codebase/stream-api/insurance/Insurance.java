package insurance;

import java.util.*;
import java.util.stream.Collectors;

public class Insurance {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = List.of(
            new InsuranceClaim("Health", 50000),
            new InsuranceClaim("Vehicle", 30000),
            new InsuranceClaim("Health", 70000),
            new InsuranceClaim("Home", 40000),
            new InsuranceClaim("Vehicle", 45000)
        );

        Map<String, Double> averageClaimAmount =
            claims.stream()
                  .collect(
                      Collectors.groupingBy(
                          InsuranceClaim::getClaimType,
                          Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                      )
                  );

        averageClaimAmount.forEach((type, avg) ->
            System.out.println(type + " : " + avg)
        );
    }
}

