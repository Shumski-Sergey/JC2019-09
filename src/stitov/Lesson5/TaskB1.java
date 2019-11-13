package stitov.Lesson5;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество слов");
        int stringNumber = in.nextInt();
        String stringArray[] = new String[stringNumber];
        System.out.println("Вводите строки");
        stringArray= Task2_2.inputstrings(stringNumber);
        StringBuilder test2 = new StringBuilder();
        long timer1, timer2, timer3, timer4;
        String test1 = new String();
        timer1 = System.nanoTime();
        for (int i = 0; i<stringNumber;i++){
            test1 += stringArray[i];
        }
        timer2 = System.nanoTime();
        System.out.println("Время работы системы через String + : "+(timer2-timer1));
        timer3 = System.nanoTime();
        for (int i = 0; i<stringNumber;i++){
            test2.append(stringArray[i]);
        }
        timer4 = System.nanoTime();
        System.out.println("Время работы системы через StringBuilder.append : "+(timer4-timer3));
    }
}
