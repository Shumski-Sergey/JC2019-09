package akhrapskaya.Stream;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова:");
        String str = sc.nextLine();
        System.out.println(getString(str));

    }

    private static String getString(String str) {
        return Arrays.stream(str.split(" +"))
                    .filter(x -> x.length() > 6)
                    .collect(Collectors.joining(", "));
    }
}
