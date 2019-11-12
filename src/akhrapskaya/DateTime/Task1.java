package akhrapskaya.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task1 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате: dd.mm.yyyy");
        String date = sc.nextLine();
        System.out.println(dayOfWeek(date));
    }

    private static String dayOfWeek(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate day = LocalDate.parse(date, formatter);
            return day.getDayOfWeek().toString();
        }
        catch (DateTimeParseException e){
            return "Вы неправильно ввели дату!";
        }
    }
}
