package stitov.Lesson8.TaskA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.*;

public class Catalog<T> {
    private static final int FIVE = 5;
    private ArrayList<T> items = new ArrayList<T>();
    Catalog(T[] outArray){
        assert false;
        this.items.addAll(Arrays.asList(outArray));
    }
    void addItem(T newItem){
        this.items.add(newItem);
    }
    void removeItem(int index){
        this.items.remove(index);
    }
    @SuppressWarnings("unchecked")
    T[] itemsToArray(Class<T> type){
        this.showFiveElements();
        T[] array;
        array = (T[]) Array.newInstance(type, this.size());
        for (int i = 0; i<this.size();i++){
            array[i] = this.items.get(i);
        }
        return array;
    }
    private void showFiveElements(){
        for (int i = 0; i<FIVE;i++){
            System.out.println(this.items.get(i));
        }
        System.out.println();
    }
    public int size(){
        return this.items.size();
    }
}
