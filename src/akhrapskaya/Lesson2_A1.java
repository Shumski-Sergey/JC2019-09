package akhrapskaya;

import java.util.Scanner;
import java.lang.Math;

public class Lesson2_A1 {
        int M,N;
        public Lesson2_A1(int M, int N){
            this.M = M;
            this.N = N;
        }
        public static void  main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число M");
            int M = sc.nextInt();
            System.out.println("Введите число N");
            int N = sc.nextInt();
            sc.close();
            Lesson2_A1 ob1 = new Lesson2_A1(M, N);
            ob1.ans();
        }
        public void ans(){
            final int K = 10;
            if (Math.abs(K- this.M) > Math.abs(K - this.N)){
                System.out.println("Ближайшее число к " + K + " " + N);
            }
            else
                System.out.println("Ближайшее число к " + K + " " + M);
        }
}
