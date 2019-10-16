package nbogdan.Lesson5.TaskA;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String minString = "", maxString = "";
        System.out.println("Введите кол-во строк");
        int maxLength = 0, minLength = Integer.MAX_VALUE;
        String[] s = new String[sc.nextInt()];
        System.out.println("Введите " + " строк");
        for (int i = 0; i < s.length; i++){
            System.out.println("Введите " + (i + 1));
            s[i] = sc.next();
            if (s[i].length() <= minLength) {
                minLength = s[i].length();
                minString = s[i];
            }
            if (s[i].length() >= maxLength) {
                maxLength = s[i].length();
                maxString = s[i];
            }
        }
        System.out.println("Минимальная строка длиной " + minLength + " символов(а): " + minString + "\nМаксимальная строка длиной " + maxLength + " символов(а): " + maxString);

    }
}
