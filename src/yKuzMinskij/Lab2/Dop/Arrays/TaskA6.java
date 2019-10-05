package yKuzMinskij.Lab2.Dop.Arrays;

public class TaskA6 {
    public static void main (String[] args) {
        int a = -166;
        int i = 0;
        while (i<100) {
                i=2*a-1+200;
                a++;
            if ((i>-100) && (i<100)) {
                for (int k=0; k<10; k++){
                    System.out.print(i + " ");
                }System.out.println();

            }
        }
    }
}
