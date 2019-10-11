package AlexandraShokhan.lesson5;

//5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
// а среди них – количество слов с равным числом гласных и согласных букв.

import java.util.Scanner;

import static AlexandraShokhan.lesson5.Task2.requestStrings;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many words would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);
        int latinWordsNum = getNumOftLatinWrds(textArray);

        System.out.println("The number of words which contain only latin letters is " + latinWordsNum + ".");

        String[] latinWds = getLatinWrds(textArray);
        System.out.println("The following words have the same number of vowels as consonants:");
        int numVowlEqlsCons = 0;
        for(int i = 0; i <= textArray.length - 1; i++) {
            if (vowlEqlCons(textArray[i]) == true) {
                System.out.println(textArray[i]);
            }
        }
    }
// Метод, который возвращает число слов латиницей в массиве строк.
    public static int getNumOftLatinWrds (String[] array) {
        int latinWords = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].matches("[a-zA-Z]+")) {
                latinWords++;
            }
        }
        return latinWords;
    }
    // Метод, который возвращает из массива массив слов латиницей.
    public static String[] getLatinWrds (String[] array) {
        String[] newArray;
        newArray = new String[array.length];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].matches("[a-zA-Z]+")) {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    // Метод, который определяет, равно ли кол-во гласных в слове кол-ву согласных (только англ.).
    public static boolean vowlEqlCons(String string)
    {
        boolean equals = false;
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else consonants++;
        }
        if (vowels == consonants) {
            equals = true;
        }
        return equals;
    }
}
