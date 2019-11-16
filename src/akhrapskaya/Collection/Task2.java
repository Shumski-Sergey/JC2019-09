package akhrapskaya.Collection;

/*2.Создать коллекцию, наполнить ее случайными числами. Удалить
повторяющиеся числа.*/

import akhrapskaya.Utils.Utils;
import java.util.ArrayList;

public class Task2 {
    private static final int UPPER_BOUND = 20;
    private static final int LOWER_BOUND = 0;
    private static final int MAX_ITEMS_NUMBERS = 100;

    public static void  main(String[] args) {
        int itemNumbers = Utils.putInInt("Введите количество элементов.", MAX_ITEMS_NUMBERS);
        ArrayList<Integer> list = Utils.setListRand(LOWER_BOUND, UPPER_BOUND, itemNumbers);
        System.out.println(list);
        System.out.println(listOffReps(list));
    }
    private static ArrayList<Integer> listOffReps(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer integer : list) {
            if (newList.indexOf(integer) == -1) {
                newList.add(integer);
            }
        }
        return newList;
    }
}
