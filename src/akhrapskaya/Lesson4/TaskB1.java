package akhrapskaya.Lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void  main(String[] args){
        String s = "3.Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова" +
                " распечатать (при переворачивании нежелательно создавать еще один массив).";
        Pattern p = Pattern.compile("[^\\s\\d\\wа-яА-Я]");
        Matcher matcher = p.matcher(s);
        int i = 0;
        while (matcher.find()){
            i++;
        }
        System.out.println("Количество знаков препинания в строке:" + i);
    }

}
