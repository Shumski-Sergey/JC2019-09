package dmikulionak.lesson_5_regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите текст для подсчета слов ");
        String s = s1.nextLine();
        String[] word = s.split("\\s+");
        System.out.println(word.length);
    }
}


