package Java8.DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthDay = LocalDate.of(2001, 10, 7);

        Period between = Period.between(now, birthDay);
        System.out.println(between);

    }
}
