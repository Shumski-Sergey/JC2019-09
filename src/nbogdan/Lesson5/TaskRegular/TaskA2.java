package nbogdan.Lesson5.TaskRegular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        Pattern p = Pattern.compile("\\b[a-zA-Zа-яА-ЯёЁ]+\\b");
        Matcher m = p.matcher(sc.nextLine());
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("Количество слов в тексте: " + count);
    }
}
