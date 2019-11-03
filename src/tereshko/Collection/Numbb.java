package tereshko.Collection;



import java.util.ArrayList;
import java.util.List;

import static tereshko.Collection.MyRandom.randomMark;

class Numbs extends School {
    final static int BADMARK = 4;
    final static int ONEMILLION = 1000000;
    final static int TENTHOUSAND = 10000;
    final static int GRADE=10;

    static List<Integer> setMark() {
        List<Integer> marks = new ArrayList<>();
        System.out.println("Введите кол-во учащисхя ?");
        setStudents();
        for (int i = 0; i < getStudents(); i++) {
            marks.add(randomMark());
        }
        return marks;
    }
}
