package akhrapskaya.Stream;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


public class Task4 {
    private static final String WORD = "world";

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла.");
        Path path = Paths.get("src/akhrapskaya/Stream/"+ sc.nextLine());
        countWords(path, WORD);
    }

    private static void countWords(Path path, String s) {
        try (Stream<String> stream = Files.lines(path)){

             long count = stream
                    .flatMap(x -> Arrays.stream(x.split("[^a-zA-Z'а-яА-Я]+")))
                    .map(String::toLowerCase)
                    .filter(x -> x.equals(s))
                    .count();
            System.out.println(count);

        }
        catch (IOException e) {
            System.out.println("Невозможно прочитать файл!");
        }
    }
}
