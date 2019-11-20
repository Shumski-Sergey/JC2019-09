package aflyer.Exam;
//Найти в массиве число, которое повторяется наибольшее количество раз.

import aflyer.Methods.ArrayRandomizer;
import aflyer.Methods.SetMethod;

import java.util.*;

public class TaskA3 {
    private static final int BYTE_MAX_VALUE = Byte.MAX_VALUE;

    public static void main ( String[] args ) {
        Random r = new Random();
        int range = Math.abs(r.nextInt(BYTE_MAX_VALUE));
        int size = Math.abs(r.nextInt(BYTE_MAX_VALUE));
        ArrayList list = ArrayRandomizer.newArrayList(size, range);
        HashMap <Integer, Integer> mapa = new HashMap <>();
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            if (!mapa.containsKey(list.get(i))) {
                mapa.put((Integer) list.get(i), count);
            } else {
                count += mapa.get(list.get(i));
                mapa.replace((Integer) list.get(i), count);
            }
        }

        SetMethod.HashMapIntIntOutput(mapa);
        TreeSet keys = new TreeSet();
        keys.addAll(mapa.values());
        int key = 0;
        for (Map.Entry <Integer, Integer> item : mapa.entrySet()){
            if (item.getValue()==keys.last())
                key = item.getKey();}

        System.out.println("Наибольшее количество раз(" + mapa.get(key) + ") повторяется элемент " + key );

    }
}


