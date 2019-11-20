package nsivko.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class utils {

    public static ArrayList<Integer> getMassiveNumbers() {
        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        ArrayList<Integer> massiveNumber = new ArrayList<>();
        System.out.println("Введите массив чисел: ");
        for (int i = 0; i < size; i++) {
            Scanner numbers = new Scanner(System.in);
            massiveNumber.add(numbers.nextInt());
        }
        return massiveNumber;
    }
    public static void print(Integer max, HashMap<Integer, Integer> numbers, Integer[] key) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(key[i]).equals(max)) {
                System.out.println("Число " + key[i] + " встречается " + numbers.get(key[i] + " раза"));
            }
        }
    }

    public static Integer searchMax(Integer max, HashMap<Integer, Integer> numbers) {
        for (Integer v : numbers.values()) {
            if (max < v) max = v;
        }
        return max;
    }

    public static Integer[] getMassiveKey(HashMap<Integer, Integer> numbers) {
        Integer[] key = new Integer[numbers.size()];
        numbers.keySet().toArray(key);
        return key;
    }

    public static HashMap<Integer, Integer> getHashMap(ArrayList<Integer> massiveNumber) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (Integer m : massiveNumber) {
            Integer value = numbers.get(m);
            if (value == null) {
                numbers.put(m, 1);
            } else {
                numbers.put(m, value + 1);
            }
        }
        return numbers;
    }

    public static void printMinMaxSum(int max, int min, int sum) {
        System.out.println("Max число равно " + max);
        System.out.println("Min число равно " + min);
        System.out.println("Сумма остальных чисел: " + sum);
    }
}
