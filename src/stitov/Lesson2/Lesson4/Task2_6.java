package stitov.Lesson2.Lesson4;
import java.util.*;

public class Task2_6 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = in.nextLine();
        String[] words = s.split("( +)|()\t");
        int a = words.length;
        if (words[0].isEmpty()){
            a -=1;
        }
        System.out.println("Количество слов "+a);
    }
}
