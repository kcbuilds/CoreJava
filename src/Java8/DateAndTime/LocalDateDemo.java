package Java8.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        LocalDate customDate = LocalDate.of(2002,10,7);

        System.out.println(toDay);
        System.out.println(customDate);

        int dayOfMonth = toDay.getDayOfMonth();
        Month month = toDay.getMonth();
        int dayOfYear = toDay.getDayOfYear();
        DayOfWeek dayOfWeek = toDay.getDayOfWeek();
        int monthValue = toDay.getMonthValue();

        System.out.println(monthValue) ;
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);

        LocalDate yesterday = toDay.minusDays(1);
        LocalDate pastDate = toDay.minusMonths(100);

        System.out.println(yesterday);
        System.out.println(pastDate);

        if (toDay.isAfter(yesterday)){
            System.out.println("Today");
        }



    }
}
