package yKuzMinskij.Control;

import java.util.HashMap;


public class TaskA3 {
    public static void main (String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] list = creatingMarksArray();

        for (Integer s : list) {
            if (map.containsKey(s)) {
                Integer value = (map.get(s)) + 1;
                map.put(s, value);
            } else {
                map.put(s, 1);
            }
        }
        //Map<Integer, Integer> treeMap = new TreeMap<>(map);
        //System.out.println(treeMap.get(treeMap.size()));
        for (HashMap.Entry entry : map.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }

    private static int[] creatingMarksArray () {
        int[] marksArray = new int[100];
        for (int i = 0; i != marksArray.length; i++) {
            marksArray[i] = (int) (Math.random() * 10);
        }
        return marksArray;
    }
}