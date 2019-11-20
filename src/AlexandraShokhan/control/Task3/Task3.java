package AlexandraShokhan.control.Task3;

// 3.Найти в массиве число, которое повторяется наибольшее количество раз.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static AlexandraShokhan.Utils.createRandomArrayList;
import static AlexandraShokhan.Utils.getKeysByValue;

public class Task3 {
    static final int LENGTH = 10;
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 10;
    public static void main(String[] args) {
        ArrayList<Integer> list = createRandomArrayList(LENGTH, MIN_VALUE, MAX_VALUE);
        System.out.println("The list of random numbers is: " + list);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        int max = Collections.max(map.values());
        System.out.println(getKeysByValue(map, max) + " repeats " + max + " times.");
    }
}
