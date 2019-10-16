package tereshko.Lesson3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int z=1;
        int number;
        int sumsum = 0;

        for (int i = 0; i < 11; i++) {
            number = (a/z) % 10;

            z =z* 10;
            sum += number;
        }
        for (int i = 0;i<3 ; i++) {
            number = (sum/z) % 10;
            z=z*10;
            sumsum+=number;

        }
        System.out.println(sum);
        System.out.println(sumsum);

    }
}




