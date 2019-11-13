package zyahya.Set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором они встречаются в строке.
// При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие из разного количества одинаковых букв анаграммами не являются

public class number3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова через пробел: ");

        String Text = in.nextLine();
        Text = Text.toLowerCase();
        String[] words = Text.split(" ");

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i <= words.length - 1; i++) {
            String tempword = words[i];
            char[] Sym = words[i].toCharArray();
            Arrays.sort(Sym);

            String WordKey = new String(Sym);
            map.merge(WordKey, tempword, (a, b) -> a + " " + b);
        }
        System.out.println();

        for (String k2 : map.values()) {
            System.out.println(k2);
        }
    }
}
