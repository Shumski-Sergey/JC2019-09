package ssivko.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        System.out.println("Введите текст со знаками припинания: ");
        String text = srt.nextLine();
        System.out.println("Введено: "+text);
        Pattern p = Pattern.compile("[,!?:.]");
        Matcher mat = p.matcher(text);
        int nom = 0;
        while (mat.find()){
            nom++;

        }
        int r = nom;
        System.out.println("Количество знаков припинания: "+r);
    }
}
