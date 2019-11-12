package balexej.lesson12;
//2. Считать с консоли данные(массив слов).
// Записать в другую переменную String строку(через запятую слова), длина которых строго больше 6.
// В конце запятой не должно быть.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    public static void main(System[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
     Stream<String> textSplit = Arrays.stream(text.split(" + "));
     System.out.println(textSplit);


    }
}
