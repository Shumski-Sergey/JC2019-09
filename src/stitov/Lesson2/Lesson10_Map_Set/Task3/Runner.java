package stitov.Lesson2.Lesson10_Map_Set.Task3;

import java.util.*;
import stitov.Lesson2.utilsST.PrintArray;

public class Runner {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line: ");
        String line = scanner.nextLine();
        line = line.toLowerCase();
        ArrayList<String> arrayFromLine = Words.getStringArray(line);
        ArrayList<ArrayList<String>> finalArray = Words.getGroups(arrayFromLine);
        PrintArray.printArrayOfArray(finalArray);
    }



}
