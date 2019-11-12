package akhrapskaya.DateTime;


import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task1 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате: dd.mm.yyyy");
        String date = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate day = LocalDate.parse(date, formatter);
            System.out.println(day.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            System.out.println(day.getDayOfWeek());
        }
        catch (DateTimeParseException e){
            System.out.println("Вы неправильно ввели дату!");
        }

        /*Timestamp timestamp = new Timestamp()
        Timestamp timestamp =  new Timestamp(Long.parseLong(date));
        LocalDate newday = timestamp.toLocalDateTime().toLocalDate();
        System.out.println(newday);*/
    }
}
