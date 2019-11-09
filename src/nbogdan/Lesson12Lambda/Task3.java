package nbogdan.Lesson12Lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные, напишите \"stop\", чтобы прекратить");
        ArrayList<String> text = new ArrayList<>();
        String textadd;
        for (;;){
            textadd = sc.nextLine();
            if (textadd.equals("stop")) break;
            text.add(textadd);
        }
        Pattern p = Pattern.compile("^\\d+$");
        text.stream().filter(p.asPredicate()).forEach(System.out::println);
    }
}
