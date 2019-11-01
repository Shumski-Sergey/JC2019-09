package tereshko.NewCollection;

import java.util.Scanner;

class Scan {
    private static Scanner scanner = new Scanner(System.in);
    static int setScanner() {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Это не целое число");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }
}
