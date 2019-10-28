package akhrapskaya.Lesson7;


import java.util.ArrayList;
import java.util.Arrays;


public class Convert<T> {
    private T[] array;

    private Convert(T[] array) {
        this.array = array;
    }
    public T getArrayIn(int i) {
        return array[i];
    }
    private ArrayList<T> getList() {
    ArrayList<T>  list = new ArrayList<>();
    list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        return list;
    }

    public static void  main(String[] args) {
        Integer[] ar = {20, 50, 30, 45, 80, 90, 200, 55};
        Convert<Integer> c = new Convert<>(ar);

        for (Integer k : c.getList())
            System.out.print(k + " ");
        System.out.println(" ");

        Cats[] cats = new Cats[4];
        for(int j =0; j< cats.length; j++)
            cats[j] = new Cats();
        cats[0].setName("Barsik");
        cats[0].setAge(5);
        cats[1].setName("Pushok");
        cats[1].setAge(3);
        cats[2].setName("Snejok");
        cats[2].setAge(1);
        cats[3].setName("Kisa");
        cats[3].setAge(4);
        Convert<Cats> catsConvert = new Convert<>(cats);

        for(Cats k : catsConvert.getList())
            System.out.println(k.getName() + " " + k.getAge());

    }
}
