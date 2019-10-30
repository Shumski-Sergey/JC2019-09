package dmikulionak.lesson_5_regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите текст ");
        String s = s1.nextLine();
        Pattern pattern = Pattern.compile("([aA-zZ]|[аА-яЯ])\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}
