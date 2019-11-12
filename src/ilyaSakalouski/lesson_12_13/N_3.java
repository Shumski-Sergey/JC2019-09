package ilyaSakalouski.lesson_12_13;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N_3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some words with numbers." +"\n" + "Enter it with spaces:");
        String words = sc.nextLine();
        String[] text = words.split(" ");

        List<String> list = Arrays.asList(text);

       // list = list.stream().filter(////////////).map(Integer::parseInt).collect(Collectors.toList());
        for (String s : list)
            System.out.print(s + " ");
    }
}

