package vtafeliuk.Lesson3;
import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int a = sc.nextInt();
        boolean q = true;

        for (int b = 2; (b < a) && q; b++) {
            if (a % b == 0) {
                System.out.println(a + ": Не простое число");
                q = false;
            }
        }
        if (q) {
            System.out.println(a + ": Простое число");
        }
    }
}