package ssivko.lab4;

import java.util.Random;
import java.util.Scanner;

public class TaskM2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = in.nextInt();
        int b, i, f=0, w=0, sum=0;
        b = a;
        int s[] = new int[b];
        Random ran = new Random();
        System.out.print("Массив имеет вид: ");
        for (i = 0; i < b; i++) {
            s[i] = ran.nextInt(100);
            System.out.print(s[i] + " ");
        }
        int min, max,d=0;
        min = max = s[0];
        for (int c = 1; c < b; c++) {
            if (s[c] < min) min = s[c];
            if (s[c] > max) max = s[c];
        }
        System.out.println("\nМинимальное значение: "+min+ ".  Максимальное значение: "+max);
        for (int c = 0; c < b; c++) {
            if (max == s[c])
            {f=c;}
            if (min == s[c])
            {w=c;}

        }
        for (int c = 0; c < b; c++) {
            if (f>w){
                if (c>w && c<f) {
                    sum += s[c];
                }
            }
           else if (f<w){
                if (c<w && c>f){
                    sum += s[c];
                }
         }
        }
            System.out.println("Сумма чисел между ними: " + sum);

    }
}
