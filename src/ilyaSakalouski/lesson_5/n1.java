package ilyaSakalouski.lesson_5;

import java.util.Date;
import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long now = System.currentTimeMillis();

        System.out.println("ВВЕДИТЕ ПЕРВУЮ СТРОКУ");
        String s = sc.nextLine();
        System.out.println("ВВЕДИТЕ ВТОРУЮ СТРОКУ");
        String t = sc.nextLine();
        System.out.println(s + " " + t);

        long time1 = System.currentTimeMillis();

        StringBuilder text = new StringBuilder(s);
        text.append(" " + t);
        System.out.println(text);

        long time2 = System.currentTimeMillis();

        if(time1 - now > time2 - time1) {
            System.out.println("ПЕРВЫЙ СПОСОБ БЫСТРЕЕ");
        } else {
            System.out.println("ВТОРОЙ СПОСОБ БЫСТРЕЕ");
        }
    }
}
