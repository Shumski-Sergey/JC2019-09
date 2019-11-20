package ssivko.Test;

import java.util.HashMap;
import java.util.Scanner;

public class TestB {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        String [] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Integer [] numberMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < numberMonth.length; i++){
            hashMap.put(numberMonth [i], month [i]);
        }
        if (m>12){
            System.out.println("ты лошара, месяцев двенадцать!");
            if (m<=0){
                System.out.println("болван не может быть месяц нулевым или отрицательным");
            }
        }
        System.out.println(hashMap.get(m));


        /*System.out.println("Введите число от 1 до 12: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String monthNumber;
        switch (month){
            case 1: monthNumber = "Январь";
                break;
            case 2: monthNumber = "Февраль";
                break;
            case 3: monthNumber = "Март";
                break;
            case 4: monthNumber = "Апрель";
                break;
            case 5: monthNumber = "Май";
                break;
            case 6: monthNumber = "Июнь";
                break;
            case 7: monthNumber = "Июль";
                break;
            case 8: monthNumber = "Август";
                break;
            case 9: monthNumber = "Сентябрь";
                break;
            case 10: monthNumber = "Октябрь";
                break;
            case 11: monthNumber = "Ноябрь";
                break;
            case 12: monthNumber = "Декабрь";
                break;
                default: monthNamber = "Ввели неверное число";
                    break;
        }
        System.out.println(monthNamber);
        */

    }
}
