package aflyer.les10_Maps;

import aflyer.Methods.ArrayRandomizer;
import aflyer.Methods.SetMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.

public class TaskA2 {
    public static void main ( String[] args ) {

        Random r = new Random();
        int size = r.nextInt(Byte.MAX_VALUE);
        int range = r.nextInt(Byte.MAX_VALUE);
        ArrayList SomeList = ArrayRandomizer.newArrayList(size, range);
        HashMap <Object, Integer> mapa = new HashMap <>();
        ArrayRandomizer.OutputArray(SomeList);
        for (int i = 0; i < SomeList.size(); i++) {
            int count = 1;
            if (!mapa.containsKey(SomeList.get(i))) {
                mapa.put(SomeList.get(i), count);
            } else {
                count += mapa.get(SomeList.get(i));
                mapa.replace(SomeList.get(i), count);
            }

        }
        SetMethod.HashMapOutput(mapa);

    }


}
