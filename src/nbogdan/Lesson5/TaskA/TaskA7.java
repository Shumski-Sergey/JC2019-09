package nbogdan.Lesson5.TaskA;

import java.util.Scanner;

public class TaskA7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов введем?");
        String[] words = new String[sc.nextInt()];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }
        for (String s: words) {
            if (s.length() == TaskA4.nymOfSym(s)) {
                System.out.println("Первое слово, где все элементы уникальны: " + s);
                break;
            }
        }
    }
}
