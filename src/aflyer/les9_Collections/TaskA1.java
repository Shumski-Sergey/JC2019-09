package aflyer.les9_Collections;
//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Random;


public class TaskA1 {
    private static final Integer BADMARK = 30;

    public static void main(String[] args) {
        int kolvo = 25;
        int marksrange = 100;
        ArrayList SchoolJournal = new ArrayList();
        SchoolJournal = ArrayRandomizer.fillArray(SchoolJournal, kolvo, marksrange);
        ArrayRandomizer.OutputArray(SchoolJournal);
        deletinUnGood(SchoolJournal);
        ArrayRandomizer.OutputArray(SchoolJournal);


    }

    private static void ouPut(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
        System.out.print("\n");
    }

    private static void deletinUnGood(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) <= BADMARK) {
                list.remove(i);
            } else i++;

        }

    }

    private static void filinIn(ArrayList<Integer> list, int kolvo) {
        Random m = new Random();
        for (int i = 0; i < kolvo; i++) {
            list.add(i, m.nextInt(100));
        }

    }

}
