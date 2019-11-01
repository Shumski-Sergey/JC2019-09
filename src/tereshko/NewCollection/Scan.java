package tereshko.NewCollection;

import java.util.Scanner;

class Scan {
    private static Scanner scanner = new Scanner(System.in);

    static int setScanner() {
        int a = 0;
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Это не целое число");
                scanner.next();
                a++;
                if (a == 5) {
                    System.out.println("Ты можешь ввести число?или нет?Введи нормально");
                    a = 0;
                }
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }
}
