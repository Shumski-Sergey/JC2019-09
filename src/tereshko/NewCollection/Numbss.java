package tereshko.NewCollection;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static tereshko.NewCollection.MyRandom.randomMark;

class Marks extends School {
    final static int BADMARK = 4;
    final static int ONEMILLION = 1000000;
    final static int TENTHOUSAND = 10000;
    final static int GRADE=10;

    @NotNull
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
