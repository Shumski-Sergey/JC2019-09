package yKuzMinskij.Lab5.StringsWithotRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
 */
public class TaskA3 {
    public static void main (String[] args) throws IOException {
    puzSort(packer());
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
    private static void puzSort (String[] arrayOfLines) throws IOException {
        int min=arrayOfLines[0].length();
        for (int n = arrayOfLines.length-1; n>=1; n--){
            for (int i=0; i<n; i++){
                if (arrayOfLines[i].length()>arrayOfLines[i+1].length()){
                    String temp = arrayOfLines[i];
                    arrayOfLines[i] = arrayOfLines[i+1];
                    arrayOfLines[i+1] = temp;
                }
            }
        }
        outPut(arrayOfLines);
    }
    private static void outPut (String[] arrayOfLines) throws IOException {
        for (int i = 0; i<arrayOfLines.length; i++){
            if (i!=arrayOfLines.length/2){
            System.out.println(arrayOfLines[i] + " : ДЛИНА СТРОКИ : " + arrayOfLines[i].length());
            }continue;
        }
    }
}