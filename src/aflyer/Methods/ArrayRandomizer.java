package aflyer.Methods;

import java.util.ArrayList;
import java.util.Random;

//Заполняем заданный массив случайными числами

public class ArrayRandomizer<I extends Number> {
    private ArrayList list;
    private int size;
    private int range;

    public ArrayRandomizer() {
        this.list = new ArrayList<Integer>();
        this.size = 0;
        this.range = 0;

    }


    public ArrayRandomizer(ArrayList list, int size, int range){
        this.list = list;
        this.size = size;
        this.range = range;
    }

    /**
     * @param list given ArrayList for filling
     * @param size size of ArrayList or number of elements for filling by random numbers
     * @param range range of taking random numbers
     * @return ArrayList with "size" elements filled randomizely from "range"
     */
    public static ArrayList fillArray(ArrayList list, int size, int range) {
        Random m = new Random();
        for(int i=0; i<size; i++){
            list.add(i, m.nextInt(range));
        }
        return list;


    }


}
