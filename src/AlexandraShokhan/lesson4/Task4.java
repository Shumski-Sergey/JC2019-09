package AlexandraShokhan.lesson4;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

import static AlexandraShokhan.lesson4.Task2.createRandomArray;

public class Task4 {
    public static void main(String[] args) {

        int[] randomArray;
        randomArray = createRandomArray(6, 1, 100);

        System.out.println("Элементы массива в прямом порядке:");
        printArray(randomArray, false);
        System.out.println("Элементы массива в обратном порядке:");
        printArray(randomArray, true);

    }

    // Метод, который печатает массив в прямом или обратном порядке.
    public static void printArray(int array[], boolean isReverse) {

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
