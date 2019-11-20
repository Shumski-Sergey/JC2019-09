package yKuzMinskij.Control;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class TaskA1 {
    public static void main (String[] args) {
        int[] list = creatingNumsArray();
        int max = maxNumOfArray(list);
        int min = minNumOfArray(list);
        System.out.println("Максимальный элемент массива : " + max + "\nМинимальный элемент маасива" + min);
        System.out.println("Сумма всех остальных элементов массива : " + Arrays.stream(list)
                .filter(x -> x != min && x != max)
                .peek(x -> parseInt(String.valueOf(x))).sum());
    }

    private static int[] creatingNumsArray () {
        int[] numArray = new int[100];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100);
        }
        return numArray;
    }

    private static int maxNumOfArray (int[] numsArray) {
        int maxNum = 0;
        for (int value : numsArray) {
            if (value > maxNum) {
                maxNum = value;
            }
        }
        return maxNum;
    }

    private static int minNumOfArray (int[] numsArray) {
        int minNum = 99;
        for (int value : numsArray) {
            if (value < minNum) {
                minNum = value;
            }
        }
        return minNum;
    }
}