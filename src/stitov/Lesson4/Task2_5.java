package stitov.Lesson4;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_5 {
    public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Введите строку:");
      String s = in.nextLine();
        Pattern p = Pattern.compile("[.?!,;:-]");
        Matcher mat = p.matcher(s);
        int i = 0;
        while (mat.find()){
            i++;
        }
        System.out.println("В предложении содержится "+ i+ " знаков препинания");
    }
}
