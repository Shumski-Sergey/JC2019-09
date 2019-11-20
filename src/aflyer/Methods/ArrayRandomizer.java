package aflyer.Methods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayRandomizer {
    private ArrayList list;
    private int size;
    private int range;

    public ArrayRandomizer() {
        this.list = new ArrayList<>();
        this.size = 0;
        this.range = 0;

    }

    public ArrayRandomizer(ArrayList list, int size, int range) {
        this.list = list;
        this.size = size;
        this.range = range;
    }

    /**
     * Creates new ArrayList (Integer) filled randomly from "range"
     *
     * @param size  size of new ArrayList
     * @param range range of taking random numbers
     * @return new sized ArrayList(Integer) filled random elemenst
     */
    public static ArrayList newArrayList(int size, int range) {
        Random m = new Random();
        ArrayList newList = new ArrayList();
        for (int i = 0; i < size; i++) {
            newList.add(i, Math.abs(m.nextInt(range)));
        }
        return newList;
    }
    /**
     * Creates new LinkedList (Integer) filled randomly from "range"
     *
     * @param size  size of new ArrayList
     * @param range range of taking random numbers
     * @return new sized LinkedList(Integer) filled random elemenst
     */
    public static LinkedList newLinkedList(int size, int range) {
        Random m = new Random();
        LinkedList newList = new LinkedList();
        for (int i = 0; i < size; i++) {
            newList.add(i, Math.abs(m.nextInt(range)));
        }
        return newList;
    }

    /**
     * Fill in given ArrayList randomly from "range"
     *
     * @param list  given ArrayList for filling
     * @param size  size of ArrayList or number of elements for filling by random numbers
     * @param range range of taking random numbers
     * @return ArrayList with "size" elements filled randomely from "range"
     */
    public static ArrayList fillArray(ArrayList list, int size, int range) {
        Random m = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, Math.abs(m.nextInt(range)));
        }
        return list;

    }

    /**
     * Fill in given LinkedList randomly from "range"
     *
     * @param list  given LinkedList for filling
     * @param size  size of LinkedList or number of elements to fill by random numbers
     * @param range range of taking random numbers
     * @return LinkedList with "size" elements filled randomly from "range"
     */
    public static LinkedList fillLinkArray(LinkedList list, int size, int range) {
        Random m = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, m.nextInt(range));
        }
        return list;
    }

    /**
     * OutPuts each element of List in one line with spaces and takes new line when ends
     *
     * @param list given List for output to console     *
     */
    public static void OutputArray(List<Integer> list) {
        for (int x : list)
            System.out.print(x + " ");
        System.out.print("\n");
    }
    public static int FindMax(List <Integer> list) {
        int max = list.get(0);
        for (int x : list) {
            if (x > max) max = x;
        }
        return max;
    }
    public static int FindMin(List <Integer> list) {
        int min = list.get(0);
        for (int x : list) {
            if (x < min) min = x;
        }
        return min;
    }

    public static int GetSum(List <Integer> list) {
            int sum = 0;
            for (int x : list) {
                sum += x;
            }
            return sum;
    }


}

