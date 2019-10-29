package AlexandraShokhan;

import java.util.ArrayList;
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
