package nbogdan.Lesson2.TaskB;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        String s;
        do {
            int x = 5 + (int) (Math.random() * 151);
            System.out.println("Случайно сгенерированное число в промежутке [5;155]: " + x);
            if (x > 25 && x <100) {System.out.println("Число попадает в диапазон (25;100).");}
            else {System.out.println("Число не попадает в диапазон (25;100)");}
            System.out.println("Если хотите закончить цикл, напишите end. \nЕсли хотите продолжить, нажмите Enter");
            s = sc.nextLine();
            if (s.equals("end") || s.equals("END")) {a = true;}
        } while (!a);
    }
}
