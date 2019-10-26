package aflyer.les9_Collections;
//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Random;

public class TaskA2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Random m = new Random();
        int r = m.nextInt(Byte.MAX_VALUE);
        int size = m.nextInt(r);
        int range = m.nextInt(r);
        list = ArrayRandomizer.fillArray(list, size, range);
        list = deleteEqualNumbers(list);
        ArrayRandomizer.OutputArray(list);
    }

    private static ArrayList deleteEqualNumbers(ArrayList list) {
        ArrayList uniqueList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!uniqueList.contains(list.get(i))) {
                uniqueList.add(list.get(i));
            }
        }
        return uniqueList;
    }
}
