package zyahya.Array;

public class Array6 {
    public static void main(String[] args) {
        for (int a = 2, i = 0; i < a; a = 2 * a - 1, i++) {
            if (a <= 10000) {
                System.out.print(a + " ");

            }
        }
        System.out.println();
        for(int i=0, a=2;a<10000; a=2*a-1 ) {
            System.out.print(a + " ");
        }
    }
}
