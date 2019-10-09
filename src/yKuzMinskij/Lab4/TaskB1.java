package yKuzMinskij.Lab4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    /**
     * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
     * общее их количество
     */

public class TaskB1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String regex = ("[\\S&&\\W&&\\D]");
        Pattern p =Pattern.compile(regex);
        Matcher m = p.matcher(s);
        int i=0;
        while (m.find()){ i++;
        System.out.println(m.group());}
        System.out.println(i + " знака препинания");
    }

}
