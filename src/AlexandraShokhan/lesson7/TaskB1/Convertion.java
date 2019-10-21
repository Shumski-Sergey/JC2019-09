package AlexandraShokhan.lesson7.TaskB1;

import java.util.ArrayList;

public class Convertion<T> {

    T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public ArrayList<T> convertArrayToList(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i <= array.length - 1; i++) {
            list.add(array[i]);
        }
        return list;
    }
}
