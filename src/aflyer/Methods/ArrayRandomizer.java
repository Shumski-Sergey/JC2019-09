package aflyer.Methods;

import java.util.ArrayList;
import java.util.LinkedList;
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
     * @param list  given ArrayList for filling
     * @param size  size of ArrayList or number of elements for filling by random numbers
     * @param range range of taking random numbers
     * @return ArrayList with "size" elements filled randomizely from "range"
     */
    public static ArrayList fillArray(ArrayList list, int size, int range) {
        Random m = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, Math.abs(m.nextInt(range)));
        }
        return list;

    }

    /**
     * @param list  given LinkedList for filling
     * @param size  size of LinkedList or number of elements to fill by random numbers
     * @param range range of taking random numbers
     * @return LinkedList with "size" elements filled randomizely from "range"
     */
    public static LinkedList fillLinkArray(LinkedList list, int size, int range) {
        Random m = new Random();
        for (int i = 0; i < size; i++) {
            list.add(i, m.nextInt(range));
        }
        return list;
    }

    /**
     * OutPuts each element of Arraylist in one line with spaces and takes new line when ends
     *
     * @param list given ArrayList for output to console     *
     */
    public static void OutputArray(ArrayList<Integer> list) {
        for (int x : list)
            System.out.print(x + " ");
        System.out.print("\n");

    }

    /**
     * OutPuts each element of Linkedlist in one line with spaces and takes new line when ends
     *
     * @param list given LinkedList for output to console     *
     */
    public static void OutputArray(LinkedList<Integer> list) {
        for (int x : list)
            System.out.print(x + " ");
        System.out.print("\n");

    }


}
