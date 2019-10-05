package nbogdan.Lesson4.TaskMassive;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1B2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[,.!?]");
        Matcher matcher = p.matcher("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите гребаный текст, в котором мы найдем количество знаков препинания и количества слов");
        String text = sc.nextLine();
        matcher.reset(text);
        int counter = 0;
        while (matcher.find()) {counter++;}
        System.out.println("Количество знаков препинания: " + counter);
        p = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+:?(?=[ ,.!?]|$)");
        counter = 0;
        matcher = p.matcher(text);
        while (matcher.find()) {counter++;}
        System.out.println("Количество слов в предложении: " + counter);
    }
}
