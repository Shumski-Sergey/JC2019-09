package AlexandraShokhan.lesson4;

// 2. Определите сумму элементов массива, расположенных между минимальным
//и максимальным значениями.

import static AlexandraShokhan.lesson4.Task2.createRandomArray;

public class Task3 {
    public static void main(String[] args) {

        int sum = 0;

        int[] randomArray;
        randomArray = createRandomArray(6,1,100);

        int minIndex = findMin(randomArray);
        System.out.println("MaxIndex = " + minIndex);
        int maxIndex = findMax(randomArray);
        System.out.println("MaxIndex = " + maxIndex);

        if (minIndex < maxIndex) {

            for (int i = minIndex + 1; i <= maxIndex - 1; i++) {
                sum = sum + randomArray[i];
            }
        } else {
            for (int i = maxIndex + 1; i <= minIndex - 1; i++) {
                sum = sum + randomArray[i];
            }
        }
System.out.print("The sum equals to "+ sum);


    }

    // Метод, который возврашает максимальное число из массива.
    public static int findMax(int array[]) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Метод, который возврашает минимальное число из массива.
    public static int findMin(int array[]) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
