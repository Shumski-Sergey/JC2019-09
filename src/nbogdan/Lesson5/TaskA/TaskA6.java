package nbogdan.Lesson5.TaskA;

import java.util.Scanner;

public class TaskA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов введем?");
        String[] s = new String[sc.nextInt()];
        int WC;
        boolean check = false;
        char[] charWord;
        for (int i = 0; i < s.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            s[i] = sc.next();
        }
        for (String word: s) {
            charWord = word.toCharArray();
            WC = charWord[0];
            for (int i = 1; i < word.length(); i++) {
                if ((int)charWord[i] == WC + 1) {
                    WC = charWord[i];
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Слово, где символы последовательны по номеру: " + word);
                break;
            }
        }
    }
}
