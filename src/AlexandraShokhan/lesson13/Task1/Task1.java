package AlexandraShokhan.lesson13.Task1;

// 1. Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел. Закрыть поток ввода-вывода.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import static AlexandraShokhan.Utils.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        FileInputStream fis = new FileInputStream("src/AlexandraShokhan/lesson13/Task1/input.txt");
        List<Integer> list = new ArrayList<>();
        while (fis.read() != -1) {
            list.add(fis.read());
        }
        fis.close();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        int max = Collections.max(map.values());
        System.out.println(getKeysByValue(map, max) + " repeats " + max + " times.");
    }
}
