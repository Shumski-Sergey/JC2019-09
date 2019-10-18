package stitov.Lesson2.Lesson5;
import java.util.Scanner;
import stitov.Lesson2.Lesson5.Task2_2;

public class Task2_3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int stringnumber = in.nextInt();
        String stringarray[] = new String[stringnumber];
        System.out.println("Вводите строки");
        stringarray= stitov.Lesson2.Lesson5.Task2_2.inputstrings(stringnumber);
        int totalLength = 0;
        double avarageLength;
        String signCompare;
        for (String i: stringarray){
            totalLength +=i.length();
        }
        avarageLength = (double) totalLength/ (double) stringnumber;
        do {
            System.out.println("Введите знак > или <");
            signCompare = in1.next();
        } while (!(signCompare.equals(">")) && !(signCompare.equals("<")));
        System.out.println("Средняя длина равна "+ avarageLength);
        if (signCompare.equals("<")){
            printLess(stringarray,avarageLength);
        } else {
            printMore(stringarray,avarageLength);
        }

    }
    public static void printLess(String stringArray[], double avaregeLength){
        int stringLength;
        for (String i : stringArray){
            if (avaregeLength> (double) i.length()){
                System.out.println(i);
            }
        }
    }
    public static void printMore(String stringArray[], double avaregeLength){
        int stringLength;
        for (String i : stringArray){
            if (avaregeLength< (double) i.length()){
                System.out.println(i);
            }
        }
    }
}
