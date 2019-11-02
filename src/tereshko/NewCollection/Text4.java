package tereshko.NewCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Text4 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> link = new LinkedList<>();
        Getss list1 = new Getss(), linkliste1 = new Getss();
        Addss list2 = new Addss(), linklist2 = new Addss();

        equalsGetLists(list1, linkliste1, array, link);
        equalsAddLists(list2, linklist2, array, link);
    }

    private static void equalsAddLists(Addss a, Addss b, List<Integer> array, List<Integer> link) {
        a.measureTime(array);
        b.measureTime(link);
    }

    private static void equalsGetLists(Getss a, Getss b, List<Integer> array, List<Integer> link) {
        a.measureTime(array);
        b.measureTime(link);
    }
}
