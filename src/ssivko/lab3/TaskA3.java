package ssivko.lab3;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args){
        long a, b, c;
        int i =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        a = sc.nextLong();
        b = a;
        while( b != 0){
            i++;
            b = b / 1000;
        }
        int s = i;
        long[] ch = new long[s];
        long v = a;
        for(int j = s ; j > 0 ; j--) {
            c = v % 1000;
            v /= 1000;
            ch[j-1] = c;
        }
        System.out.print(ch[0]);
        for( i = 1 ; i < s ; i++ ){
            System.out.print(" " + ch[i]);
        }
    }
}




