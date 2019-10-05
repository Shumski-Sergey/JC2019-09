package vtafeliuk.Lesson2;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число больше 0: ");
        int a = sc.nextInt();
        int c = 0; // почему не работает без присвоения стартового значения (int = c;)? null?

        for (int b = 1; b <= a; b++) {
            c = c + b;
        }
        System.out.println("Сумма числе от 1 до " + a + " равна: " + c );
    }
}
