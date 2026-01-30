package temperature_alert;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 40.0;

        Predicate<Double> temperatureAlert = temp -> temp > threshold;

        checkTemperature(35.5, temperatureAlert);
        checkTemperature(42.0, temperatureAlert);
        checkTemperature(39.0, temperatureAlert);
    }

    static void checkTemperature(double temperature, Predicate<Double> predicate) {

        if (predicate.test(temperature)) {
            System.out.println("ALERT! Temperature crossed threshold: " + temperature);
        } else {
            System.out.println("Temperature normal: " + temperature);
        }
    }
}

