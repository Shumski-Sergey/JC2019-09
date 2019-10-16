package nbogdan.Lesson5.TaskA;

import java.util.Scanner;

public class TaskA5 {
    private static boolean onlyEnglish(String word) {
        String check = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZaeiouyAEIOUY";
        char[] chWord = word.toCharArray();
        for (char c: chWord) {
            if (!check.contains(String.valueOf(c))) {return false;}
        }
        return true;
    }
    private static boolean equalsLetters(String word) {
        int numVow = 0, numCons = 0;
        String vowels = "aeiouyAEIOUY", consonants = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ", WC = "";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {numVow++;}
            if (consonants.contains(String.valueOf(word.charAt(i)))) {numCons++;}
        }
        return (numCons == numVow);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов введем?");
        String[] words= new String[sc.nextInt()];
        int numOfLatWords = 0, numOfEquals = 0;
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            words[i] = sc.next();
            if (onlyEnglish(words[i])) {
                numOfLatWords++;
                if (equalsLetters(words[i])) {
                    numOfEquals++;
                }
            }
        }
        System.out.println("Количество слов из букв английского алфавита: " + numOfLatWords + "\nСреди них в " + numOfEquals + " словах одинаково гласных и согласных");
    }
}
