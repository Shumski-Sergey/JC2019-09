package aflyer.les11_Stream;
//Считать с консоли данные(массив слов).
// Записать в другую переменную String строку(через запятую слова), длина которых строго больше 6. \
// В конце запятой не должно быть.

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskA2 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова!");
        String words = sc.nextLine();
        String [] Arrwords = words.split(" +");
        String newWords = Stream.of(Arrwords)
                .filter(x -> x.length() > 6)
                .collect(Collectors.joining(", "));
        System.out.println("Вот результат:"+ newWords);
    }
}
