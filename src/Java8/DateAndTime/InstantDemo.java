package Java8.DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantDemo {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println(zonedDateTime);

        Instant instant1 = instant.plusNanos(1);
        System.out.println(instant1);

        Instant start = Instant.now();
        Instant end = Instant.now();

        Duration d1 = Duration.between(start,end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);

        System.out.println(d1);
        System.out.println(d2);
    }
}
