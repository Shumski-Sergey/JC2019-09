package dmikulionak.lesson_9_map;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”). Избавиться от повторяющихся элементов в строке и вывести результат на экран.
class task1 {
    public static void main(String[] args) {
        System.out.println("Введи набор чисел для избавление от повторяющихся элементов через запятую (example: 1, 2, 3, 4, 4, 5) ");
        String words = new Scanner(System.in).nextLine();
        Set<String> noReplay = new HashSet<>(Arrays.asList((words.split("(\\s|,)+"))));
        System.out.println(noReplay);
    }
}