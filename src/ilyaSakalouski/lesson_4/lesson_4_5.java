package ilyaSakalouski.lesson_4;

public class lesson_4_5 {
    public static void main(String[] args) {
        int a =2;
        int b = 9998;
        int c;
        do {
            c = 2*a-1-1;
            System.out.print(c + "\t");
            a++;
        } while (c < b);
    }
}
