package akhrapskaya.DateTime;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void  main(String[] args){
        LocalDate newYear = LocalDate.of(2019, 12, 31);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате: MM dd");
        try {
            LocalDate day = LocalDate.of(2019, sc.nextInt(), sc.nextInt());
            Duration duration = Duration.between(day.atStartOfDay(), newYear.atStartOfDay());
            System.out.print("Дней до Нового года: ");
            System.out.println(duration.toDays());
        }
        catch (DateTimeException | InputMismatchException e){
            System.out.println("Дата введена не корректно!");
        }
    }
}
