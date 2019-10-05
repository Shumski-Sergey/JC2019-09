package yKuzMinskij.Lab2.Dop.Arrays;

public class TaskA5 {
    public static void main (String[] args) {
        int a = 2;
        int i = 0;
        while (i<10000) {
            for (int k=0; k<10; k++){
                i=2*a-1-1;
                System.out.print(i + " ");
                a++;
            }System.out.println();
        }
    }
}
