package AlexandraShokhan.lesson5;

// 8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
// Если таких слов больше одного, найти второе из них.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static AlexandraShokhan.lesson5.Task2.requestStrings;
import static AlexandraShokhan.lesson5.Task8.hasUniqueChars;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many words would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);

        findWordWithOnlyDifferentSymbols(textArray);

        findFirstOrSecondNumericPalindromicWord(textArray);

    }

    public static void findWordWithOnlyDifferentSymbols(String[] sourceWords) {
        for (String word : sourceWords) {
            if (word.length() > 1 && hasUniqueChars(word)) {
                System.out.println("Слово, состоящее только из различных символов: " + word);
                break;
            }
        }
    }

    public static boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[+-]?[0-9]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        return numericMatcher.matches();
    }

    public static void findFirstOrSecondNumericPalindromicWord(String[] sourceWords) {
        List<String> oneOrTwoNumericPalindromicWords = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                boolean isInputPalindrome = word.equals(new StringBuilder(word)
                        .reverse().toString());
                if (isInputPalindrome) {
                    oneOrTwoNumericPalindromicWords.add(word);
                }
            }
        }
        final String message = "Слово-палиндром, состоящее только из цифр: ";
        if (oneOrTwoNumericPalindromicWords.size() == 0) {
            System.out.println(message + "Нет слов");
            return;
        }
        if (oneOrTwoNumericPalindromicWords.size() == 1) {
            System.out.println(message + oneOrTwoNumericPalindromicWords.get(0));
        } else {
            System.out.println("Слов-палиндромов, состоящих только из цифр, > 1. Второе из них: "
                    + oneOrTwoNumericPalindromicWords.get(1));
        }
    }
}
