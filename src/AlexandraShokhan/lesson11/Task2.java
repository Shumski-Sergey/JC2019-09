package AlexandraShokhan.lesson11;

// 2. Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
// длина которых строго больше 6. В конце запятой не должно быть.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int lengthOfSelectedWords = 6;
        int numberOfWords = 4;
        List<String> words = getWords(numberOfWords);

//        List<String> selectedWords = words.stream().filter(word -> word.length() >= 6).collect(Collectors.toList());
        printSelectedWords(words);

    }

    public static ArrayList<String> getWords(int numberOfWords) {
        List<String> words = new ArrayList<>();
        for (int i = 0; i < numberOfWords; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter word # " + (i + 1) + ":");
            words.add(in.nextLine());
        }
        return (ArrayList<String>) words;
    }

    public static void printSelectedWords(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            } else System.out.print(".");
        }
    }
}
