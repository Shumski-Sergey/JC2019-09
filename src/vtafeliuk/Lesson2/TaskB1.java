package vtafeliuk.Lesson2;

import java.util.Random;

public class TaskB1 {
    public static void main(String[] args) {

        Random rd = new Random();
        int a = rd.nextInt(151) + 5;

        if (a >= 25 && a <= 100) {
            System.out.println("Число " + a + " находится в промежутке от 25 до 100");
        } else {
            System.out.println("Число " + a +  " не находится в промежутке от 25 до 100");
        }
    }
}
