package aflyer.les9_Collections;
//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Random;

public class TaskA2 {
    public static void main ( String[] args ) {
        Random m = new Random();
        int r = m.nextInt(Byte.MAX_VALUE);
        int size = m.nextInt(r);
        int range = m.nextInt(r);
        ArrayList list = ArrayRandomizer.newArrayList(size, range);
        System.out.println("НаRandomили вот так:");
        ArrayRandomizer.OutputArray(list);
        list = deleteEqualNumbers(list);
        System.out.println("Скидыщь!");
        ArrayRandomizer.OutputArray(list);
    }

    private static ArrayList deleteEqualNumbers (ArrayList list) {
        ArrayList uniqueList = new ArrayList();
        for (Object o : list) {
            if (!uniqueList.contains(o)) {
                uniqueList.add(o);
            }
        }
        return uniqueList;
    }
}
