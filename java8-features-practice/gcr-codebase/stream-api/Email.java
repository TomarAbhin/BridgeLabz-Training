package email;

import java.util.*;

public class Email {

    public static void main(String[] args) {

        List<String> emails = List.of("Abhay@gmail.com","Bharat@gmail.com","Abhinav@gmail.com");

        emails.forEach(email -> sendEmailNotification(email)); // send notification
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Notification email sent to: " + email);
    }
}

