package tereshko.NewCollection;

import java.util.*;

import static tereshko.NewCollection.Numbs.setMark;

public class Test2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(setMark());
        System.out.println("Неповторяющиеся оценки:" + set);
    }
}
