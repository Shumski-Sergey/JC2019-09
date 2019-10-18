package nbogdan.Lesson5.TaskRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = sc.nextLine();
        Pattern p = Pattern.compile("https?://.+?\\..+?/?\\b");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("Найдено " + s.substring(m.start(), m.end()));
        }
    }
}
