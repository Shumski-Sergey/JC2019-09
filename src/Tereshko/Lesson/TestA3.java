package Tereshko.Lesson;

import java.util.Scanner;

public class TestA3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int a[]={8,49,15};
        for (int i = 0; i <3; i++) {
            for (int j = 2; j >i ; j--) {
                if (a[j] < a[j-1]) {
                    int b;
                    b=a[j-1];
                    a[j-1]=a[j];
                    a[j]=b;
                }
            }

        }
        for (int i = 0; i <a.length ; i++) {

            System.out.println(a[i]);

        }
    }
}
