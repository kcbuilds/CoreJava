package Java8.DateAndTime;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        String nowTime = "10:32";
        LocalTime parse = LocalTime.parse(nowTime);
        System.out.println(parse);
        LocalTime localTime = parse.minusMinutes(15);
        System.out.println(localTime);

        if (now.isAfter(localTime)){
            System.out.println("Yes");
        }

    }
}
