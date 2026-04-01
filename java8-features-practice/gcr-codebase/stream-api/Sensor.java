package sensor;

import java.util.*;

public class Sensor {

    public static void main(String[] args) {

        List<Double> sensorReadings = List.of(22.5,35.0,18.9,40.2,29.7);

        double threshold = 30.0;

        sensorReadings.stream()
                      .filter(r -> r > threshold) // readings above threshold
                      .forEach(System.out::println);
    }
}

