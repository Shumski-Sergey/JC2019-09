package stitov.Lesson2.Lesson5;
import java.util.Scanner;
import stitov.Lesson2.Lesson5.Task2_2;
public class Task2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int stringnumber = in.nextInt();
        String stringarray[] = new String[stringnumber];
        System.out.println("Вводите строки");
        stringarray = stitov.Lesson2.Lesson5.Task2_2.inputstrings(stringnumber);
        char simbols[][] = new char[stringnumber][50];
        int flag = 0;
        int numberOfSimbol;
        int charLength[] = new int[stringnumber];
        int minChar, minIndex = 0;
        for (int i = 0; i < stringnumber; i++) {
            numberOfSimbol = 0;
            for (int j = 0; j < stringarray[i].length(); j++) {
                flag = 0;
                for (int k = 0; k < numberOfSimbol; k++) {
                    if (stringarray[i].charAt(j) == simbols[i][k]) {
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    simbols[i][numberOfSimbol] = stringarray[i].charAt(j);
                    numberOfSimbol++;
                }

            }
            charLength[i] = numberOfSimbol;
            if (stringarray[i].length() == charLength[i]) {
                System.out.println("Первое слово состоящее из разичных символов: " + stringarray[i]);
                break;
            }
        }

    }
}