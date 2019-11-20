package balexej.lesson12;

//3. Считать с консоли данные.
// Вывести во вторую переменную все числа, которые есть в первом файле.
// Числа выводить через пробел.
// Пример - 12 text var2 14 8v 1 Результат: 12 14 1

import balexej.Lesson9Colletion.LinkedListArrayList.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку ");
        String text = sc.nextLine();
       String[] array = text.split("\\^");
       Stream<String> stream = Arrays.stream(array);
        String out = stream.filter(value -> {
            Pattern pat = Pattern.compile("\\d");
            Matcher mat = pat.matcher(value);
            if (mat.matches()) {
                return true;
            } else
                return false;
        }).collect(Collectors.joining(" "));
        System.out.println(out);
    }
    }

