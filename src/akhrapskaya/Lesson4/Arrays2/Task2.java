package akhrapskaya.Lesson4.Arrays2;

import akhrapskaya.Lesson4.Arrays.MyArrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        MyArrays ar = new MyArrays("Введите количество элементов:");
        ar.setIn("Введите элементы массива:");
        System.out.println(sum(Math.min(ar.minInd(),ar.maxInd()), Math.max(ar.minInd(),ar.maxInd()), ar));

    }
    private static int sum(int mini, int maxi, MyArrays ar) {
        int sum = 0;
        for (int i = ++mini; i < maxi; i++) {
            sum += ar.array[i];
        }
        return sum;
    }
}

