package nsivko.lab4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskMB2 {
    public static void main(String[] args) {
        System.out.print("Введите текст: ");
        Scanner t = new Scanner(System.in);
        String tt = t.nextLine();
        Pattern  pat = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Matcher m = pat.matcher(tt);
        int ch = 0;
        while (m.find()) {
            ch++;
        }
        System.out.println("Общее количество слов: " + ch);

    }
}
