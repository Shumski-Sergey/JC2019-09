package akhrapskaya.KR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static akhrapskaya.KR.Utils.setListRand;

public class Task3 {
    private static final int UPPER_BOUND = 6;
    private static final int LOWER_BOUND = 0;
    private static final int NUMBER = 20;

    public static void  main(String[] args){
        ArrayList<Integer> array = setListRand(LOWER_BOUND, UPPER_BOUND, NUMBER);
        System.out.println(array);
        HashMap<Integer, Integer> map = ArrayToMap(array);
        System.out.println(map);
        System.out.println(getMax(map));
    }

    private static HashMap<Integer, Integer> ArrayToMap(ArrayList<Integer> array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( Integer i : array){
             map.put(i, map.containsKey(i)? map.get(i)+1 : 1);
        }
        return map;
    }
    private static ArrayList<Integer> getMax(HashMap<Integer, Integer> map) {
        Integer maxV = Collections.max(map.values());
        return (ArrayList<Integer>) map.entrySet().stream()
                .filter(x -> x.getValue().equals(maxV))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
