package ssivko.lab4;

import java.util.Random;

public class TaskM3 {
    public static void main (String[] args){
        int s[] = new int[20];
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            s[i] = ran.nextInt(100);
            System.out.print(s[i] + " ");
        }
        int n = s.length;
        int t;

        for (int i = 0; i < n/2; i++) {
            t = s[n-i-1];
            s[n-i-1] =s [i];
             s[i] = t;
        }
        System.out.println("\nПеревернутый массив: ");
        for (int i=0; i<s.length; i++){
            System.out.print(s[i]+ " ");
        }
    }
}
