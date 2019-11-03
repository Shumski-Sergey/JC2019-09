package stitov.Lesson2.Lesson10_Map_Set.Task2;

import stitov.Lesson2.utilsST.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\D");
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(pattern.split(line)));
        HashMap<String,Integer> map = arrayToMap(arrayList);
        Printer.printKeysInMap(map);
    }
    private static HashMap<String,Integer> arrayToMap(ArrayList<String> arrayList){
        HashMap<String,Integer> map = new HashMap<>();
        for (String str: arrayList){
            map.put(str, 1);
        }
        return map;
    }
}
