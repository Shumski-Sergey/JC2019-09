package kushakov.Lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
public class TaskA4 {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        LinkedList<Double> lin = new LinkedList<>();
        final int q = 1000000;
        final int w = 1000;
        for (int i = 0; i<q; i++){
            arr.add(Math.random());
            lin.add(Math.random());
        }
        long strt =  System.currentTimeMillis();
        for ( int i = 0; i<w; i++){
            arr.get((int) (Math.random()*(q-1)));
        }
        System.out.println(System.currentTimeMillis() - strt);
        strt = System.currentTimeMillis();
        for (int i = 0; i<w; i++){
            lin.get((int) (Math.random()*(q-1)));
        }
        System.out.println(System.currentTimeMillis() - strt);
    }
}
