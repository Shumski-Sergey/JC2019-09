package akhrapskaya.KR;

import java.util.Scanner;

public class Task2 {
    public static void  main(String[] args){
        String s = getStringFromConsole();
        if (s.matches("[\\d]+") && Integer.parseInt(s) > 0 && Integer.parseInt(s) < 13){
            System.out.println( new Month(Integer.parseInt(s)).getMonth());
        }
        else
            System.out.println("Некорректно введены данные!");

    }

    private static String getStringFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в диапазоне [1-12]");
        return sc.nextLine();
    }
}
