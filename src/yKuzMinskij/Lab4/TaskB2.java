package yKuzMinskij.Lab4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    /**
    * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
    * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
    * текста также могут быть пробелы, но могут и отсутствовать.
    */

public class TaskB2 {
    public static void main (String[] args) {
        String s = inputText();
        Pattern p = Pattern.compile(" *(\\w*)* *");
        Matcher m = p.matcher(s);
        int i;
        for (i=0; m.find(); i++) {
            System.out.println(m.group()+ " ");
        }
        System.out.println(i-1 + " слов");

    }
    public static String inputText (){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
}
