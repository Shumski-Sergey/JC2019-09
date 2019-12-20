package zyahya.generics;
//Написать метод для конвертации массива строк/чисел в список.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] array = new String[]{"something", "also", "ok"};
        List<String> list = new ArrayList<>();
        arrayConvert(array, list);
        System.out.println(list);
    }

    public static void arrayConvert(String[] array, List<String> list) {
        list.addAll(Arrays.asList(array));
    }
}
