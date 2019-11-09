package stitov.Lesson10_Map_Set.Task3;

import java.util.*;
import stitov.utilsST.Printer;

public class Runner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        ArrayList<String> arrayFromLine = Words.getStringArray(line);
        ArrayList<ArrayList<String>> finalArray = Words.getGroups(arrayFromLine);
        Printer.printArrayOfArray(finalArray);
    }



}
