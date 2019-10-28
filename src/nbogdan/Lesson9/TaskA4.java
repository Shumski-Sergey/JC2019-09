package nbogdan.Lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

class TaskA4 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linkList = new LinkedList<>();
        long WC, arrTime, linkTime;
        for (int i = 0; i < 1000000; i++) {
            arrList.add(r.nextInt(20000));
            linkList.add(r.nextInt(20000));
        }
        arrTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrList.get(r.nextInt(1000000));
        }
        arrTime = System.currentTimeMillis() - arrTime;

        linkTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkList.get(r.nextInt(1000000));
        }
        linkTime = System.currentTimeMillis() - linkTime;
        System.out.print("Время, затраченное для ArrayList: " + arrTime + " мс.\nДля LinkedList: " + linkTime + " мс.");
    }
}
