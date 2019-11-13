package asenyuk.Lesson8_Collection.Task4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task4 {
    int numb4A;
    int numb4l;
    int get4;
    private final int MAX_GRADE = 10;
    private final int SIZE_LIST = 1000000;
    final int sizeGet;

    {
        sizeGet = 10000;
    }

    int genericNumbs4() {
        return numb4A = (int) (Math.random() * MAX_GRADE);
    }

    int genericGet() {
        return get4 = (int) (Math.random() * SIZE_LIST);
    }

    int genericNumbs4l() {
        return numb4l = (int) (Math.random() * MAX_GRADE);
    }
    ArrayList<Integer> ganericNumbers4() {
        ArrayList<Integer> numbs4 = new ArrayList<>();
        for (int i = 0; i <= SIZE_LIST; i++) {
            numbs4.add(genericNumbs4());
        }
        return (numbs4);
    }

    void getNumbers4A(ArrayList<Integer> arraylist4) {
        for (int x = 0; x < sizeGet; x++) {
            arraylist4.get(genericGet());
        }
    }
    void getNumbers4l(LinkedList<Integer> linkedList4) {
        for (int y = 0; y < sizeGet; y++) {
            linkedList4.get(genericGet());
        }

    }

    LinkedList<Integer> ganericNumbers4L() {
        LinkedList<Integer> numbs4l = new LinkedList<>();
        for (int i = 0; i <= SIZE_LIST; i++) {
            numbs4l.add(genericNumbs4());
        }
        return (numbs4l);
    }

}
