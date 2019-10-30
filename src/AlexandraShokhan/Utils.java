package AlexandraShokhan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    // Метод, который возврашает случайное число от min до max.
    public static int getRandomNum(int min, int max) {
        int i = ThreadLocalRandom.current().nextInt(min, max + 1);
        return i;
    }

    // Метод, который возврашает ArrayList<Integer> случайных чисел определенной длины.
    public static ArrayList<Integer> createRandomArrayList(int length, int minValue, int maxValue) {
        ArrayList<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomArray.add(getRandomNum(minValue, maxValue));
        }
        return randomArray;
    }

    // Метод, который возврашает LinkedList<Integer> случайных чисел определенной длины.
    public static LinkedList<Integer> createRandomLinkedList(int length, int minValue, int maxValue) {
        LinkedList<Integer> randomArray = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            randomArray.add(getRandomNum(minValue, maxValue));
        }
        return randomArray;
    }

    // Метод, который выбирает случайное значение из List<Integer> n количество раз.
    public static void getRandomNTimes(List<Integer> anyList, int numberOfTimes) {
        Integer random;
        Random getRandom = new Random();
        for (int i = 1; i <= numberOfTimes; i++) {
            random = anyList.get(getRandom.nextInt(anyList.size()));
        }
    }

    // Метод, который возврашает максимальное значеник ArrayList<Integer>.
    public static int getMaxIntInArrayList (ArrayList<Integer> arrayList) {
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
}
