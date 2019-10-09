package AlexandraShokhan.lesson4;

// 1.Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String text = "Quick six blind smart, out burst. Perfectly on furniture dejection: determine my depending; an to. Add short, water - court fat.";
        int numOfPunctuationMarks = 0;
        Pattern punctuationMarks = Pattern.compile("[,.?!;:-]+");
        Matcher matcher = punctuationMarks.matcher(text);
        while(matcher.find()) {
            numOfPunctuationMarks++;
        }
        System.out.print("The number of punctuation marks in the text is " + numOfPunctuationMarks);
    }
}