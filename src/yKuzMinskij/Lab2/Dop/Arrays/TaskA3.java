package yKuzMinskij.Lab2.Dop.Arrays;

public class TaskA3 {
    public static void main (String[] args) {
        int num = 150;
        while (num>=0) {
            for (int i=0; i<10&&num>=0; i++){
                System.out.print(num + " ");
                num-=5;
                }System.out.println();
            }
    }
}
