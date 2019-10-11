package akhrapskaya.Lesson5;

import java.util.Scanner;

//3. Доменные имена для протоколов http и https, с необязательным слешем в конце. Специальые символы не используются.
public class TaskB3 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите доменное имя:");
        String s = sc.nextLine();
        System.out.println(s.matches(" *https?://([a-zA-Z]{3,}).[a-zA-Z]{2,3}/? *"));
    }
}
