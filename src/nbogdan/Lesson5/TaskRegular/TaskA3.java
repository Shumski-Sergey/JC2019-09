package nbogdan.Lesson5.TaskRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = "", textBl = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]\\b");
        Matcher m = p.matcher(textBl);
        while (m.find()) {
            s += textBl.substring(m.start(), m.end());
        }
        System.out.println("Все последние буквы слов вместе: " + s);
    }
}
