package vtafeliuk.Lesson2;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {

        double m;
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        m = sc.nextDouble();
        n = sc.nextDouble();

        if (Math.abs(10-m)==Math.abs(10-n)){
            System.out.println("числа равноудалены от 10");
        } else if (Math.abs(10-m)>Math.abs(10-n)){
            System.out.println(n);
        } else {
            System.out.println(m);
        }
    }
}
