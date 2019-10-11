package yKuzMinskij.Lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов
 */

public class TaskA3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String regex = "[a-z]\\b";
        Pattern p =Pattern.compile(regex);
        Matcher m = p.matcher(s);
        int i=0;
        while (m.find()){ i++;
            System.out.print(m.group());}
        System.out.println(i + " знака препинания");
    }

}

