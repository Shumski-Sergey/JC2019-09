package akhrapskaya.Lesson4;

import java.util.regex.Matcher;


public class TaskB2 {
    public static void  main(String[] args){
        String s = "   Имеется строка  с текстом. Подсчитать количество слов в тексте. Желательно\n" +
                "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\n" +
                "текста также могут быть пробелы, но могут и отсутствовать.";

        String[] words = s.split( "\\s+");
        int k = words.length;
        if (words[0].matches("[\\s]?"))
            k--;
        System.out.println("Количество слов:" + k);
    }

}
