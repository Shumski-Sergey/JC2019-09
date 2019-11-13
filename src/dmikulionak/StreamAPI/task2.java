package dmikulionak.StreamAPI;

//Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова), длина которых
// строго больше 6. В конце запятой не должно быть.


import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        String array[] = new String[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.next();
        }
        String streamFromValues = Stream.of(array).filter(word -> word.length() > 6).collect(Collectors.joining(", "));
        System.out.println(streamFromValues);
    }
}


