package vtafeliuk.Lesson5.Usual;

import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько,
// найти первое из них.
public class TaskA4 {

    private static int uniqueSymbols(String word) {
        StringBuilder u = new StringBuilder();
        String c;
        for (int i = 0; i < word.length(); i++) {
            c = String.valueOf(word.charAt(i));
            if (u.indexOf(c) == -1) {
                u.append(c);
            }
        }
        return u.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of words");
        int size = scanner.nextInt();
        String[] words = new String[size];
        //наполняем массив мловами с консоли
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter the " + (i + 1) + " word");
            words[i] = scanner.next();
        }
        //ищем слово с минимальным количеством уникальных символов и выводим его на нулевой индекс

        for (int j = words.length - 1; j > 0; j--) {
            for (int k = 0; k < j; k++)
                if (uniqueSymbols(words[k]) > uniqueSymbols(words[k + 1])) {
                    String tenp = words[k];
                    words[k] = words[k + 1];
                    words[k + 1] = tenp;
                }
        }
        System.out.println("Слово с минимальным количеством уникальных символов: " + words[0]);
    }
}
