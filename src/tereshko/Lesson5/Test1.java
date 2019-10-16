package tereshko.Lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        Pattern punctuation = Pattern.compile("[!?.,:;/-]");
        String text="С клавиатуры посимвольно вводится предложение. Определить количество знаков препинания в предложении. Знаками препинания считать:. , - : ; ? !. Концом, предложения считать следующие знаки препинания: ? ! и.";
        Matcher matcher=punctuation.matcher(text);
        int count=0;
        while (matcher.find()){
            count++;
        }

        System.out.println(count);
    }
}
