package nbogdan.Lesson5.TaskA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько строк введем?");
        String[] s = new String[sc.nextInt()];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Введите " + (i + 1) + " строку:");
            s[i] = sc.next();
        }
        Arrays.sort(s, Comparator.comparingInt(String::length));
        System.out.println("\nСтроки по возрастанию:");
        for (String a: s) {
            System.out.println(a);
        }
        System.out.println("\nСтроки по убыванию:");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}
