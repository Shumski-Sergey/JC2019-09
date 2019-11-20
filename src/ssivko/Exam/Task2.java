package ssivko.Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Integer[] numberMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < numberMonth.length; i++) {
            hashMap.put(numberMonth[i], month[i]);
        }
        if (m > 12) {
            System.out.println("месяцев должно быть двенадцать!");
        } else if (m <= 0) {
            System.out.println("Не может быть отрицательным или нулевым!");
        } else {
            System.out.println("Ты выбрал " + hashMap.get(m));
        }
    }
}