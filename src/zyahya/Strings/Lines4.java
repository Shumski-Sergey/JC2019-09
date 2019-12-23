package zyahya.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines4 {
    public static void main(String[] args) {
        int count=1;
        Pattern pattern= Pattern.compile("[a-zA-z]");
        Matcher matcher=pattern.matcher("abcdehjkl;");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+ " ");
        }
        System.out.println("");
    }
}
