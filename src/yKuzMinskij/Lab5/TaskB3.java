package yKuzMinskij.Lab5;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Доменные имена для протоколов http и https, с необязательным слешем в конце. Специальые символы не используются.
 * Примеры:
 * http://example.com/ — Да
 * example.com — Нет
 * кремль.рф — Нет :(
 */

public class TaskB3 {
    public static void main (String[] args) throws IOException {
        controller(addressChecker(addressIn()));
    }
    private static String addressIn () throws IOException {
        System.out.println("Введите имя домена");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String address = sc.readLine();
        return address;
    }
    private static boolean addressChecker (String address){
        Pattern p = Pattern.compile("[http|https]+\\:+\\/?.+\\/?");
        Matcher m = p.matcher(address);
        boolean answer = m.find();

        return answer;
    }
    private static void controller (boolean answer){
        if (answer == true){
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
