package vtafeliuk.Lesson3;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");

        int a;
        int sum = 0;

        for (a = sc.nextInt() ; a != 0; a = a / 10) {
            sum = sum + (a % 10);
        }
        System.out.println("Sum = " + sum);
    }
}
