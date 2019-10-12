package AlexandraShokhan.lesson4;

//2.Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = in.nextLine();
int words = text.split("(\\s|\\.|\\,)+").length;
System.out.println(words);

    }
}