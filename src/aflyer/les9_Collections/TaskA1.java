package aflyer.les9_Collections;
//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import aflyer.Methods.ArrayRandomizer;

import java.util.ArrayList;
import java.util.Scanner;


public class TaskA1 {
    private static final Integer BAD_MARK = 30;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество учеников в классе:");
        int kolvo = sc.nextInt();
        System.out.println("Какая система оценок действует на данный момент?");
        int marksrange = sc.nextInt();
        ArrayList SchoolJournal = ArrayRandomizer.newArrayList(kolvo, marksrange);
        System.out.println("Вот все оценки:");
        ArrayRandomizer.OutputArray(SchoolJournal);
        deleteUnGood(SchoolJournal);
        System.out.println("Вот оценки для Министерства образования:");
        ArrayRandomizer.OutputArray(SchoolJournal);

    }

    private static void deleteUnGood (ArrayList <Integer> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) <= BAD_MARK) {
                list.remove(i);
            } else i++;

        }

    }

}
