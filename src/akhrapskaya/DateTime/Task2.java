package akhrapskaya.DateTime;

import java.time.Duration;
import java.time.LocalDate;

public class Task2 {
    public static void  main(String[] args){
        System.out.println(isDateOdd());
    }

    private static boolean isDateOdd() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        LocalDate beginYear = LocalDate.of(year, 1, 1);
        Duration duration = Duration.between(beginYear.atStartOfDay(), now.atStartOfDay());
        return duration.toDays()%2 == 0 ? true : false;
    }
}
