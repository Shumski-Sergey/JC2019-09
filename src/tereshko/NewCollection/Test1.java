package tereshko.NewCollection;
//Создать список оценок учеников с помощью ArrayList, заполнить
// случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;

import static tereshko.NewCollection.Marks.BADMARK;
import static tereshko.NewCollection.Marks.setMark;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> mark = new ArrayList<>(setMark());
        for (int i=mark.size()-1; i>0;i-- ) {
            if(mark.get(i)<BADMARK){
                System.out.println("Неудовлетворительную оценку получил ученик под номером "+i+",оценку:"+mark.get(i));
                mark.remove(i);
            }
        }
       System.out.println("Список удовлетворительных оценок"+mark);
    }

}
