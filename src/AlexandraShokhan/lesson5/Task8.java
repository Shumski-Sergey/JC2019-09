package AlexandraShokhan.lesson5;

// Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.

import java.util.HashSet;
import java.util.Scanner;

import static AlexandraShokhan.lesson5.Task2.requestStrings;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many words would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);

        findWordWithOnlyDifferentSymbols(textArray);
    }
    public static boolean hasUniqueChars(String word) {
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (Character ch : word.toCharArray()) {
            if (!uniqueChars.add(Character.toLowerCase(ch))) {
                return false;
            }
        }
        return true;
    }

    public static void findWordWithOnlyDifferentSymbols(String[] sourceWords) {
        for (String word : sourceWords) {
            if (word.length() > 1 && hasUniqueChars(word)) {
                System.out.println("Слово, состоящее только из различных символов: " + word);
                break;
            }
        }
    }
}
