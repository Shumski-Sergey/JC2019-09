package nsivko.lab3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        long a, b, ost = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        a = sc.nextLong();
        b = a;
        while( b != 0){
            i++;
            b /= 1000;
        }
        int s = i;
        long[] ch = new long[s];
        long v = a;
        for(int j = s ; j > 0 ; j--) {
            ost = v % 1000;
            v /= 1000;
            ch[j-1] = ost;
        }
        System.out.print(ch[0]);
        for( i = 1 ; i < s ; i++ ){
            System.out.print(" " + ch[i]);
        }
        }
    }