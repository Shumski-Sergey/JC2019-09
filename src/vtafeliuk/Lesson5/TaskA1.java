package vtafeliuk.Lesson5;
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TaskA1 {
    public static void main(String[] args) {
        String input = "Hello world?! Hello, -..Java.";


        int startInput = input.length();
        String unsignedString = input.replaceAll("\\w", "");
        String unsignedString1 = unsignedString.replaceAll("\\s","");
        int finishInput = unsignedString1.length();
        System.out.println("Количество знаков препинания " + finishInput);

        String unsignedString2 = input.replaceAll("\\w", "");
        String unsignedString3 = unsignedString.replaceAll("\\s","");
        System.out.println(unsignedString3);

        Pattern pattern = Pattern.compile("[.,?!;:-]");
        Matcher matcher = pattern.matcher(input);
        int amount = 0;
        while (matcher.find()){
            amount++;
        }
        System.out.println("Количество знаков препинания: " + amount);

    }
}
