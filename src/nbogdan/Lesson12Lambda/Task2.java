package nbogdan.Lesson12Lambda;


//2. Считать с консоли данные(массив слов).
// Записать в другую переменную String строку(через запятую слова),
// длина которых строго больше 6. В конце запятой не должно быть.


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов введем?");
        int size = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            list.add(sc.next());
        }
        list = (ArrayList<String>)list.stream()
                .filter(s -> s.length() <= 6)
                .collect(Collectors.toList());
        for (String s: list) {
            System.out.print(s + ", ");
        }
        System.out.print("\b\b.");
    }
}
