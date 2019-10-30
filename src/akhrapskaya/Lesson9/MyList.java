package akhrapskaya.Lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class MyList {

    private ArrayList<Integer> list = new ArrayList<>();

    int size() {
        return list.size();
    }
    int getElFromList(int i) {
        return list.get(i);
    }
    void setElAtList(int el) {
        list.add(el);
    }
    void setListRand (int min, int max, int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            list.add(rand.nextInt(Math.max(min,max)-Math.min(min,max)) + Math.min(min,max));
        }
    }
    void outPut(){
        System.out.println(list);
    }
    Iterator<Integer> getIter(){
        return list.iterator();
    }
    HashSet<Integer> getSet(){
        return new HashSet(list);
    }
}
