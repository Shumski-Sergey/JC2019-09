package AlexandraShokhan.lesson11;

// 3. Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
// Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {
    private static final String SPLIT_REGEX = " +";
    private static final String MATCH_REGEX = "\\d+";
    private static final String SPACE = " ";

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter data: ");

        String strRow = Arrays.stream(in.nextLine().split(SPLIT_REGEX)) //разбиваем на слова
                .filter(s -> s.matches(MATCH_REGEX)) //оставляем только числа
                .collect(Collectors.joining(SPACE)); //форматируем вывод согласно условию
        System.out.println(strRow);
    }
}
