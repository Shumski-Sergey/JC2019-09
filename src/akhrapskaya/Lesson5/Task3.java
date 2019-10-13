package akhrapskaya.Lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void  main(String[] args){
        String s = "   Имеется строка  с текстом. Подсчитать количество слов в тексте. Желательно\n" +
                "учесть, что слова могут разделяться несколькими пробелами, в начале и конце\n" +
                "текста также могут быть пробелы, но могут и отсутствовать.\n";
        s = s+" ";
        s = s.replaceAll("[^\\s\\d\\wа-яА-Я]", "");
        StringBuilder sb = new StringBuilder("");
        Pattern p = Pattern.compile("\\s+");
        Matcher matcher = p.matcher(s);
        while (matcher.find()){
            int k = matcher.start();
            if (k != 0)
                sb.append(s.substring(k-1,k));

        }
        System.out.println(sb);
    }
}
