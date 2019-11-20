package ssivko.Exam;

import java.util.HashMap;

import static ssivko.Ulils.scanMassiv;


public class Task3 {
    public static void main(String[] args) {
        Integer[] mass = scanMassiv();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer m : mass) {
            Integer value = map.get(m);
            if (value == null) {
                map.put(m, 1);
            } else {
                map.put(m, value + 1);
            }
        }
        Integer[] listKey = new Integer[map.size()];
        map.keySet().toArray(listKey);
        int max = 0;
        for (Integer value : map.values()) {
            if (max < value) max = value;
        }
        for (Integer asListKey : listKey) {
            if (map.get(asListKey) == max) {
                System.out.println("Число " + asListKey + " встречается " + max + " раз");
            }
        }

    }
}
