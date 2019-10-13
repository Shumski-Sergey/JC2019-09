package yKuzMinskij.Lab2.Dop.Arrays;

public class TaskA1 {
    public static void main (String[] args) {
        int num = 1000;
        while (num<10000){
            for (int i=0; i<10; i++ ) {
                System.out.print(num + " ");
                num += 3;
            }System.out.println();
        }
    }
}
