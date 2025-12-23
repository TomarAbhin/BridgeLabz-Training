import java.time.ZonedDateTime;
import java.time.ZoneId;
public class TimeZone {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));  // Current time in GMT

        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));  // Current time in indian standard time

        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));    // Current time in pacific standard time
        
        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);
    }
}


