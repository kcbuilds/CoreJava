package Java8.DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        ZonedDateTime PolandTime = ZonedDateTime.now(ZoneId.of("Poland"));
        System.out.println(PolandTime);

        System.out.println(now.getZone());

        if (now.isBefore(PolandTime)){
            System.out.println("India");
        }else {
            System.out.println("Poland");
        }

    }
}
