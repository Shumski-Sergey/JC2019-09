package stitov.Lesson12_Stream.Task3;

import stitov.utilsST.Splitter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first line:");
        String strFirst = scanner.nextLine();
        System.out.println("Enter the second line:");
        String strSecond = scanner.nextLine();
        ArrayList<String> firstArray = Splitter.splitNumbers(strFirst);
        ArrayList<String> secondArray = Splitter.splitNumbers(strSecond);
        firstArray.stream().filter(secondArray::contains).map(s->s+" ").forEach(System.out::print);
    }
}
