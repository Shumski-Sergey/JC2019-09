package akhrapskaya.Lesson2;

import java.util.Random;

public class Lesson2B1 {
    public static void  main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(150) + 6;
        System.out.println("Выбранное число:" + i);
        if ( i < 100 && i > 25 ){
            System.out.println("Выбранное число попало в интервал (25;100)");
        }
        else {
            System.out.println("Выбранное число НЕ попало в интервал (25;100)");
        }
    }
}
