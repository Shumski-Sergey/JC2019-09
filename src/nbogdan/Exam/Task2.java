package nbogdan.Exam;

import java.util.Scanner;

public class Task2 {
    private static Scanner sc = new Scanner(System.in);
    private static final String[] MONTHS = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    private static void writeMonth() {
        System.out.println("Введите номер месяца");
        int MonthNum = sc.nextInt();
        if (MonthNum <= 12 && MonthNum >= 1) {
            System.out.println("Месяц " + MONTHS[MonthNum - 1]);
        } else {
            System.out.println("Нет такого месяца!");
            writeMonth();
        }
    }
    public static void main(String[] args) {
        writeMonth();
    }
}
