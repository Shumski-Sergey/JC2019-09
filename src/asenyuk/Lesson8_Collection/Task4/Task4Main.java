package asenyuk.Lesson8_Collection.Task4;


import java.util.ArrayList;
import java.util.LinkedList;

public class Task4Main {

    public static void main(String[] args) {
        Task4 Test4A = new Task4();
        Task4 Test4L = new Task4();
        long startTime1 = System.currentTimeMillis();

        ArrayList<Integer> arraylist4;
        arraylist4 = Test4A.ganericNumbers4();
        Test4A.getNumbers4(arraylist4);
        long endTime1 = System.currentTimeMillis();
        System.out.println(" TIME_ArrayList =" + (endTime1 - startTime1));
        long startTime2 = System.currentTimeMillis();

        LinkedList<Integer> linkedList4;
        linkedList4 = Test4L.ganericNumbers4L();
        Test4L.getNumbers4l(linkedList4);
        long endTime2 = System.currentTimeMillis();

        System.out.println(" TIME_LinkedList =" + (endTime2 - startTime2));


    }
}
