package balexej.lesson4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arrayB1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();

        Pattern p = Pattern.compile(",!");
        Matcher match = p.matcher(text);

        if (match.find()) {
         System.out.println(match.group());
        }




    }
}

