package vtafeliuk.Lesson9Collections;
//1. Создать список оценок учеников с помощью ArrayList, заполнить
//        случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.List;

public class TaskA1 {

    private static final int MAX_MARK = 10;
    private static final int MINIMAl_GOOD_MARK = 4;

    public static void main(String[] args) {
        List<Integer> marks = ArrayListCreator.getRandomList(MAX_MARK);
        System.out.println( "Все оценки: " + marks);

        for (int i = marks.size() - 1; i >= 0; i--) {
            if (marks.get(i) < MINIMAl_GOOD_MARK) {
                marks.remove(i);
            }
        }
        System.out.println("Только положительные оценки: " + marks);
    }
}

