package nsivko.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    Integer[] numberMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Введите номер месяца: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 1 || number > 12) {
            System.out.println("Такого номера не существует!");
        }
        else {
            Map<Integer, String> all = new HashMap<>();
            for (int i = 0; i < numberMonth.length; i++) {
                all.put(numberMonth[i], month[i]);
            }
            System.out.println(all.get(number));
        }
    }
}
