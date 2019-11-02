package tereshko.NewCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static tereshko.NewCollection.Numbs.setMark;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(setMark());
        Iterator<Integer> iter = number.iterator();
        int max = number.get(0);
        while (iter.hasNext()) {
            int nextnumb = iter.next();
            if (nextnumb > max) {
                max = nextnumb;
            }
        }

        System.out.println("Максимальная оценка " + max);
    }
}
