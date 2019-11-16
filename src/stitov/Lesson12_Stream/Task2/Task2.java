package stitov.Lesson12_Stream.Task2;

import stitov.utilsST.Splitter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Enter the line:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ArrayList<String> words = Splitter.splitWords(line);
        System.out.println(words.stream().filter(s->s.length()>6).collect(Collectors.joining(", ")));
    }
}
