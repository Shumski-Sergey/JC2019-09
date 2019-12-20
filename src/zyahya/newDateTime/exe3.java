package zyahya.newDateTime;
//Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось до Нового года. При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
//Входные данные
//Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class exe3 {
    static final int MONTH = 12;
    static final int DAY = 31;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day and the month's number : ");
        int day = input.nextInt();
        int month = input.nextInt();
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        try {
            LocalDate from = LocalDate.of(year, month, day);
            LocalDate to = LocalDate.of(year, MONTH, DAY);
            System.out.println(DAYS.between(from, to));
        } catch (Exception e) {
            System.out.println(-1);
        }

    }
}

