package vtafeliuk.Exam;

//Найти в массиве число, которое повторяется наибольшее количество раз.

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 10, 2, 3, 8, 6, 7, 10, 10, 2, 5, 2, 2, 2, 2};
        int maxMatches = 0;
        int result = 0;
        Map<Integer, Integer> matches = new HashMap<>();
        Arrays.stream(numbers).forEach(number -> matches.put(number, matches.get(number) == null ? 0 : matches.get(number) + 1));

        for (Map.Entry<Integer, Integer> integerIntegerEntry : matches.entrySet()) {
            if (maxMatches < integerIntegerEntry.getValue()) {
                maxMatches = integerIntegerEntry.getValue();
                result = integerIntegerEntry.getKey();
            }
        }

        System.out.println("Most common number: " + result);
    }
}