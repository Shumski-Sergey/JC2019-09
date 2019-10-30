package tereshko.Lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        Pattern punctuation = Pattern.compile("\\s+");
        String text="Один два три четыре пять шесть";
        String []t=text.split(text);
        int count=0;
        for (String s : t) {
            Matcher matcher = punctuation.matcher(s);
            count++;
        }
        System.out.println(count);
    }
}
