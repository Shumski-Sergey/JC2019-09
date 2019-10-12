package yKuzMinskij.Lab5.StringsWithotRegExp;

import java.awt.event.FocusAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */

public class TaskA1 {
    public static void main (String[] args) throws IOException {
        minMaxSearcher(packer());

    }
    private static String inPut () throws IOException {
        System.out.println("Введите строку");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String line = sc.readLine();
        return line;
    }
    private static String[] packer () throws IOException {
        System.out.println("Введите количество строк");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        String [] arrayOfLines = new String[arraySize];
        for (int i=0; i<arrayOfLines.length; i++){
            arrayOfLines[i]=inPut();
        }
        return arrayOfLines;
    }
    private static void minMaxSearcher (String[] arrayOfLines) throws IOException {
        int min=arrayOfLines[0].length();
        int max=0;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i=0; i<arrayOfLines.length; i++){
            if(max<arrayOfLines[i].length()) {
                maxIndex = i;
                max = arrayOfLines[i].length();
            }else if (min>arrayOfLines[i].length()){
                minIndex = i;
                min = arrayOfLines[i].length();
            }
        }
        outPut(minIndex,maxIndex,arrayOfLines);
    }
    private static void outPut (int minIndex, int maxIndex, String[] arrayOfLines) throws IOException {
        System.out.println("Самая короткая строка : " + arrayOfLines[minIndex] +
                "\nЕё длина : "+ arrayOfLines[minIndex].length());
        System.out.println("Самая длинна строка : " + arrayOfLines[maxIndex] +
                "\nЕё длина : " + arrayOfLines[maxIndex].length());

    }
}