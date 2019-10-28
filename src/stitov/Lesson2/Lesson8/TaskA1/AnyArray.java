package stitov.Lesson2.Lesson8.TaskA1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class AnyArray<T> {
    private ArrayList<T> array = new ArrayList<T>();
    AnyArray(T[] outArray){
        assert false;
        this.array.addAll(Arrays.asList(outArray));
    }
    T getValue(int index){
        return this.array.get(index);
    }

}
