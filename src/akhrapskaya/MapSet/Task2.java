package akhrapskaya.MapSet;

import java.util.HashMap;

public class Task2 {

    public static void  main(String[] args) {
        Integer[] array = {1, 2, 1, 5, 5, 5, 6, 0, 1};
        System.out.println(countElInArray(array));
    }
    private static <T>HashMap<T, Integer> countElInArray(T[] array){
        HashMap<T, Integer> count = new HashMap<>();
        for (T k : array){
            if(count.containsKey(k))
                count.put(k, count.get(k)+1);
            else
                count.put(k, 1);
        }
        return count;
    }
}
