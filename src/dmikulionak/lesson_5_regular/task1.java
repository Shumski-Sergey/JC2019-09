package dmikulionak.lesson_5_regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main (String[] args) {
        int count = 0;
        Pattern pattern = Pattern.compile("[.,;:?!\\-]");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите текст для подсчета знаков препинания ");
        Matcher matcher = pattern.matcher(s1.nextLine());
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
