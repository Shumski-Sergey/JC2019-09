package tereshko.Lesson2;

import java.util.Scanner;

public class TestA3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] a = {8, 49, 15};
        for (int i = 0; i <a.length; i++) {
            for (int j = a.length-1; j >i ; j--) {
                if (a[j] < a[j-1]) {
                    int b;
                    b=a[j-1];
                    a[j-1]=a[j];
                    a[j]=b;
                }
            }

        }
        for (int value : a) {
            System.out.println(value);
        }
    }
}
/*
for (int i = 0; i < numb.length; i++) {
        for (int j = numb.length - 1; j > i; i--) {
        if (numb[j] < numb[j - 1]) {
        int wc;
        wc = numb[j - 1];
        numb[j - 1] = numb[j];
        numb[j] = wc;
        }
        System.out.println(numb[i]);*/
