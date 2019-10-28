package akhrapskaya.Lesson9;

import java.util.ArrayList;
import java.util.HashSet;

public class Task2 {
    public static void  main(String[] args) {
        MyList numbers = new MyList();
        numbers.setListRand(0, 20, 20);
        numbers.outPut();
        HashSet set = numbers.getSet();
        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
