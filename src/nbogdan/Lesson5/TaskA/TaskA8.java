package nbogdan.Lesson5.TaskA;

import java.util.Scanner;

public class TaskA8 {
    static boolean numPalindrome(String word) {
        char[] chWord = word.toCharArray();
        int j = word.length() - 1;
        String check = "0123456789";
        for (char c: chWord) {
            if (!check.contains(String.valueOf(c))) {
                return false;
            }
        }
        for (int i = 0; i < j; i++, j--) {
            if (chWord[i] != chWord[j]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов введем?");
        String[] words = new String[sc.nextInt()];
        String palindromYo = "";
        int checkForSecond = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            words[i] = sc.next();
            if (numPalindrome(words[i])) {
                checkForSecond++;
                if (checkForSecond == 2) {
                    palindromYo = words[i];
                }
            }
        }
        System.out.println("Второе слово палиндром: " + palindromYo);
    }
}
