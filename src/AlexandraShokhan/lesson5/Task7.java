package AlexandraShokhan.lesson5;

//Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
// Если таких слов несколько, найти первое из них.

import java.util.Scanner;

import static AlexandraShokhan.lesson5.Task2.requestStrings;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many strings would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);

        findFirstWordWithSymbolCodesInAsc(textArray);

    }
    public static boolean isTwoCharSymbolCodesInAsc(char a, char b) {
        return (int) b - (int) a == 1;
    }

    public static boolean isWordSymbolCodesInAsc(String word) {
        char[] wordChars = word.toCharArray();
        if (wordChars.length < 2) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < wordChars.length - 1; i++) {
            if (isTwoCharSymbolCodesInAsc(wordChars[i], wordChars[i + 1])) {
                result = true;
            }
        }
        return result;
    }
    public static void findFirstWordWithSymbolCodesInAsc(String[] sourceWords) {
        System.out.println("Слово, символы в котором идут в строгом порядке возрастания их кодов: ");
        for (String word : sourceWords) {
            if (isWordSymbolCodesInAsc(word)) {
                System.out.println(word);
                break;
            }
        }
    }
}
