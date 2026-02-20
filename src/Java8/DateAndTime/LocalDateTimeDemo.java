package Java8.DateAndTime;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

//      String dateTime = "13-06-2002 | 12:00";  // DateTimeParseException
        String dateTime = "2002-06-13T13:48";  // DateTimeParseException

        LocalDateTime parse = LocalDateTime.parse(dateTime);
        LocalDateTime parse1 = LocalDateTime.parse("2002-06-13T13:48");
        System.out.println(parse1); 
        System.out.println(parse);

    }
}
