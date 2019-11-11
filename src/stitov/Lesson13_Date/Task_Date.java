package stitov.Lesson13_Date;

import stitov.utilsST.Splitter;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Task_Date {
    public static void main(String[] args){
        System.out.println("Enter the date if format: dd.mm.yyyy");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        try {
            if (isDateOdd(date)) {
                System.out.println("You can land");
            } else {
                System.out.println("You can't land");
            }
            System.out.println("This day is " + getDayOfWeek(date));
            System.out.println("It is "+getDaysToNewYear(date)+" days till New Year");
            System.out.println(getDayOfWeek(new Timestamp(System.currentTimeMillis())));
        }catch (Exception e){System.out.println("Incorrect format of date");}


    }

    private static boolean isDateOdd (String date){
        LocalDate localDate = getInLocalDateFromString(date);
        LocalDate newYear = LocalDate.of(localDate.getYear(), 1, 1);
        long days = Duration.between(newYear.atStartOfDay(), localDate.atStartOfDay()).toDays() +1;
        System.out.println("This day is "+days+" in year");
        return days % 2 == 1;
    }
     private static LocalDate getInLocalDateFromString (String date){
        String[] dateInString = Splitter.getDate(date);
        return  LocalDate.of(Integer.parseInt(dateInString[2]), Integer.parseInt(dateInString[1]),Integer.parseInt(dateInString[0]));
    }
    private static LocalDate getInLocalDateFromTimeStamp (Timestamp timestamp){
        return LocalDate.of(timestamp.getYear(), timestamp.getMonth(),timestamp.getDate());
    }
    private static String getDayOfWeek (String date){
        LocalDate localDate = getInLocalDateFromString(date);
        return localDate.getDayOfWeek().toString();
    }
    private static int getDaysToNewYear(String date){
        LocalDate localDate = getInLocalDateFromString(date);
        LocalDate newYear = LocalDate.of(localDate.getYear()+1, 1, 1);
        return  (int) Duration.between(localDate.atStartOfDay(), newYear.atStartOfDay()).toDays();
    }
    private static String getDayOfWeek (Timestamp timestamp){
        LocalDate localDate = getInLocalDateFromTimeStamp(timestamp);
        return localDate.getDayOfWeek().toString();
    }
}
