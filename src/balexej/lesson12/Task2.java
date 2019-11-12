package balexej.lesson12;
//2. Считать с консоли данные(массив слов).
// Записать в другую переменную String строку(через запятую слова), длина которых строго больше 6.
// В конце запятой не должно быть.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        String splitText = Arrays.stream(text.split(" +"))
                  .filter(x -> x.length() > 6)
                 .collect(Collectors.joining(", "));
         System.out.println(splitText);

    }
}
