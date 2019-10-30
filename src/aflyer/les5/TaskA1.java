package aflyer.les5;

import java.util.Scanner;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
public class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = sc.nextInt();
        String[] str = new String[n];
        String StrMin = "";
        String StrMax = "";
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = sc.next();
            if (str[i].length() > max) {
                StrMax = str[i];
                max = str[i].length();
            }
            if (str[i].length() < min) {
                StrMin = str[i];
                min = str[i].length();
            }
        }
        System.out.println("Самая длинна строка в " + max + " символов: " + StrMax);
        System.out.println("Самая короткая строка в " + min + " символов: " + StrMin);


    }
}