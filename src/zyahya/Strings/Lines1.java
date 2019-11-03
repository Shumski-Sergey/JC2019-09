package zyahya.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class Lines1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = abc.nextLine();
        int count=1;
        System.out.println(text);
        Pattern p = Pattern.compile(".\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            count++;
            System.out.print( m.start()+" " + m.group() + " ");
        }
        System.out.print(count);

    }
}