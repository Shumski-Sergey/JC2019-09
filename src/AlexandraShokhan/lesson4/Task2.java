package AlexandraShokhan.lesson4;

// 1.В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {

        int[] grades;
        grades = createRandomArray(6,1,100);

        int maxGrade = findMaxIndex(grades);
        int gradeNumber = maxGrade + 1;

        System.out.println("The number of the max grade is " + gradeNumber + ".");

    }

    // Метод, который возврашает случайное число от min до max.
    public static int getRandomNum(int min, int max) {
        int i = ThreadLocalRandom.current().nextInt(min, max + 1);
        return i;
        }

    // Метод, который возврашает массив случайных чисел определенной длины.
    public static int[] createRandomArray(int arrayLength, int minValue, int maxValue) {
            int [] randomArray;
            randomArray = new int[arrayLength];
            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = getRandomNum(minValue, maxValue);
                System.out.println( "Index " + i + ", grade " + randomArray[i]);
            }
            return randomArray;
        }

    // Метод, который возврашает индекс максимального числа из массива.
    public static int findMaxIndex(int array[]) {
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
}

