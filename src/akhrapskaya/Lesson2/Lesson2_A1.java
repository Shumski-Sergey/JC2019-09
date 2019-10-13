package akhrapskaya.Lesson2;

import java.util.Scanner;
import java.lang.Math;

public class Lesson2_A1 {
    private int M,N;
        private Lesson2_A1(int M, int N){
            this.M = M;
            this.N = N;
        }
        private void ans(){
            final int K = 10;
            if (Math.abs(K- this.M) > Math.abs(K - this.N)){
                System.out.println("Ближайшее число к " + K + " - " + N);
            }
            else
            System.out.println("Ближайшее число к " + K + " - " + M);
        }
        private static Lesson2_A1 ent1(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число M");
                int M = sc.nextInt();
            System.out.println("Введите число N");
                int N = sc.nextInt();
            sc.close();
            return new Lesson2_A1(M, N);
         }
        public static void  main(String[] args){
            Lesson2_A1 ob1 = ent1();
            ob1.ans();
        }
}
