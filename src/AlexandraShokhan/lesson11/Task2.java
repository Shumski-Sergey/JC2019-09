package AlexandraShokhan.lesson11;

// 2. Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
// длина которых строго больше 6. В конце запятой не должно быть.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words row:");
        System.out.println(getFormatRow(scanner.nextLine()));
    }

    private static String getFormatRow(String str) {
        return Arrays.stream(str.split(" +")) //делает массив слов из стоки
                .filter(x -> x.length() > 6) // фильтрует, что бы больше 6 символов было в слове
                .collect(Collectors.joining(", ")); //превращает в строку с дилиметром между словами
    }
}
