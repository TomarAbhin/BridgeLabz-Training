package lambda_expression;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFiltering {
	
	//declare static class
    static class Alert {
        String type;
        String message;

        Alert(String type, String message) {
            this.type = type;
            this.message = message;
        }

        public String toString() {
            return type + " Alert: " + message;
        }
    }

    public static void main(String[] args) {
    	//create list for alerts
        List<Alert> alerts = Arrays.asList(
                new Alert("EMERGENCY", "Kidney Failure"),
                new Alert("NORMAL", "Medicine reminder"),
                new Alert("EMERGENCY", "Blood pressure high"),
                new Alert("REGULAR CHECKUP", "Appointment scheduled")
        );
        
        //type of alert
        Predicate<Alert> emergencyOnly = alert -> alert.type.equalsIgnoreCase("EMERGENCY");

        System.out.println("Filtered Alerts:");

        alerts.stream().filter(emergencyOnly).forEach(System.out::println);
    }
}

