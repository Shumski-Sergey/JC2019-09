package ssivko.Test;

import java.util.Scanner;

public class TestB {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12: ");
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
                default: monthNumber = "Ввели неверное число";
                    break;
        }
        System.out.println(monthNumber);


    }
}
