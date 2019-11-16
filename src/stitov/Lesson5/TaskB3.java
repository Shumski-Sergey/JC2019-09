package stitov.Lesson5;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class TaskB3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String http = new String();
        System.out.println("Введите строку: ");
        http = sc.nextLine();
        Pattern p = Pattern.compile("(http://|https://)(\\w+)\\.(\\w+)/?");
        Matcher match = p.matcher(http);
        if (match.find()){ System.out.println(" - Да"); } else {System.out.println(" - Нет");}

    }
}
