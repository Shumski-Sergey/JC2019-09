package tereshko.NewCollection;


import java.util.ArrayList;
import java.util.List;

import static tereshko.NewCollection.Scan.setScanner;
import static tereshko.NewCollection.MyRandom.randomMark;

final class Marks {
    public static final int BADMARK=4;
    static List<Integer> setMark(){
     List<Integer> marks = new ArrayList<>();
        System.out.println("How many students?");
        int students=setScanner();
        for (int i = 0; i < students; i++) {
            marks.add(randomMark());
        }
        return marks;
    }
}


