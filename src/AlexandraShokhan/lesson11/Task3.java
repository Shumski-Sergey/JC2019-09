package AlexandraShokhan.lesson11;

// 3. Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
// Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter data: ");
        String input = in.nextLine();

        String [] array = input.split("\\^");

        Stream <String> stream = Arrays.stream(array);
        String output = stream.filter(value -> {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(value);
            if (matcher.matches()) {
                return true;
            } else
                return false;
        }).collect(Collectors.joining(" "));
        System.out.println(output);
    }
}
