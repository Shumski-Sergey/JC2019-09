package ssivko.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String text = srt.nextLine();
        System.out.println("Вы ввели : "+text);
        Pattern p = Pattern.compile(".\\b");
        Matcher mat = p.matcher(text);
        while (mat.find()){
            System.out.print(mat.group());
        }

    }
}
