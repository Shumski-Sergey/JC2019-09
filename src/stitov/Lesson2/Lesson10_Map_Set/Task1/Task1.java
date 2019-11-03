package stitov.Lesson2.Lesson10_Map_Set.Task1;
import stitov.Lesson2.utilsST.Printer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\D");
        HashSet<String> uniqueNumbers = new HashSet<String>(Arrays.asList(pattern.split(line)));
        Printer.printHashSetString(uniqueNumbers);

    }
}
