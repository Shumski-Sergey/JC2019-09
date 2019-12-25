package zyahya.LinesNoRegex;

import java.util.InputMismatchException;
import java.util.Scanner;

// Ввести n строк с консоли. Вывести на консоль те строки,
// длина которых меньше (больше) средней, а также длину.
public class Number3 {
    public static void main(String[] args) {
        String[] inputs;

        try {
            inputs = ScanStrings();
        } catch (InputMismatchException e) {
            System.err.print("Число не было введено!");
            return;
        }

        PrintLowAverageLengthStrings(inputs);
    }

    private static String[] ScanStrings() {
        String[] inputs = null;

        System.out.println("Введите число строк: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();

            inputs = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Введите строку № " + (i + 1) + " : ");
                inputs[i] = scanner.nextLine();
            }
        }

        return inputs;
    }

    private static void PrintLowAverageLengthStrings(String[] inputs) {
        float average_length = 0;

        for (String item : inputs) {
            average_length += (float) item.length();
        }

        average_length /= inputs.length;

        System.out.println("Строки с длиной меньше средней (" + average_length + "):");

        for (String item : inputs) {
            if (item.length() < average_length) {
                System.out.println("'" + item + "' с длиной " + item.length());
            }
        }
    }
}
