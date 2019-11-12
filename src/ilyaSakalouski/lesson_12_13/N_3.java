package ilyaSakalouski.lesson_12_13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class N_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some words with numbers." +"\n" + "Enter it with spaces:");
        String words = sc.nextLine();
        String[] text = words.split(" ");

        String list = Arrays.stream(text)
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.joining(" "));
        System.out.println(list);
    }
}

