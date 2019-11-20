package vtafeliuk.Exam;

// Найти в массиве чисел элементы с максимльным (max) и наименьшим (min). значениями.
// Вывести эти 2 элемента на экран, а также посчитать и вывестисумму всех остальных элементов
// (min и max в сумму не входят)

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 10, 2, 3, 5, 8, 6, 7, 3, 4, 5, 12,};

        int max = Arrays.stream(numbers).max().orElse(0);
        System.out.println("Max element: " + max);

        int min = Arrays.stream(numbers).min().orElse(0);
        System.out.println("Min element: " + min);

        int restElementsSum = Arrays.stream(numbers).sum() - max - min;
        System.out.println("Sum of the remaining elements: " + restElementsSum);
    }
}