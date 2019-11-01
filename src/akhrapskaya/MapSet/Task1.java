package akhrapskaya.MapSet;

/*1.Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”). Избавиться от повторяющихся элементов
 в строке и вывести результат на экран. */

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        String s = getString();
        String[] num = s.split("[,]* +");
        HashSet<String> ans = new HashSet<>();
        Collections.addAll(ans, num);
        System.out.println(ans);
    }

    private static String getString() {
        System.out.println("Введите числа:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.matches(" *([\\d]+,? +)*([\\d]+ *)$")) {
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
            s = sc.nextLine();
        }
        return s;
    }
}
