package AlexandraShokhan.lesson5;

// 2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;
import static AlexandraShokhan.lesson5.Task2.requestStrings;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many strings would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);

        bubbleSort(textArray);

        printSringArray(textArray, false);

    }
// Пузырьковая сортировка массива из строк в порядке возрастания.
    public static void bubbleSort(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }
// Печать массива, состоящего из строк, в прямом или обратном порядке.
    public static void printSringArray(String array[], boolean isReverse) {
        if (isReverse == false) {
            for (int i = 0; i <= array.length - 1; i++) {
                System.out.println("Index: " + i + ", value " + array[i]);
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println("Index: " + i + ", value " + array[i]);
            }
            return;
        }
    }
}
