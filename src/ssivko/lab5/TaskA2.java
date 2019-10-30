package ssivko.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String text = srt.nextLine();
        System.out.println("Введён текст : "+text);
        Pattern p = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Matcher mat = p.matcher(text);
        int nom = 0;
        while (mat.find()){
            nom++;
        }
        System.out.println("Количество слов : "+nom);

    }
}
