package dmikulionak.lesson_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int x;
        String[] str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк");
        x = Integer.parseInt(in.nextLine());
        str = new String[x];
        System.out.println("Введите текст");
        for (int i = 0; i < x; i++) {
            str[i] = in.nextLine();
        }
        Arrays.sort(str, Comparator.comparingInt(String::length));
        System.out.println(Arrays.asList(str));
        }
    }


