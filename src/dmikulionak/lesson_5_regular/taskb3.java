package dmikulionak.lesson_5_regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3. Доменные имена для протоколов http и https, с необязательным слешем в конце. Специальые символы не используются.
//Примеры:
//http://example.com/ — Да
//example.com — Нет
//кремль.рф — Нет :(
public class taskb3 {
    public static void main (String[] args) {
        String regexp = "";
        Scanner s1 = new Scanner(System.in);
        System.out.println("введите адрес ");
        String s = s1.nextLine();
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(s);




    }
}
