package nbogdan.Lesson5.TaskA;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество строк?");
        int num = sc.nextInt(), sum = 0;
        String[] s = new String[num];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Введите " + (i + 1) + " строку:");
            s[i] = sc.next();
        }
        for (String a: s) {
            sum += a.length();
        }
        sum /= num;
        System.out.println("Средняя длина строки: " + sum + "\nСтроки, которые меньше средней длины: ");
        for (String a: s) {
            if (a.length() < sum) {
                System.out.println(a + ". Длина: " + a.length());
            }
        }
    }
}
