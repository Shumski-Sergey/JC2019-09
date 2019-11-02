package tereshko.Collection;// случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;

import static tereshko.Collection.Numbs.BADMARK;
import static tereshko.Collection.Numbs.setMark;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> mark = new ArrayList<>(setMark());
        removeMarks(mark);
       System.out.println("Список удовлетворительных оценок"+mark);
    }
    private static void removeMarks(List<Integer> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) < BADMARK) {
                System.out.println("Неудовлетворительную оценку получил ученик под номером " + i + ",оценку:" + list.get(i));
                list.remove(i);
            }
        }
    }
}
