package yKuzMinskij.Lab8;

import java.util.ArrayList;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить
 * случайными оценками. Удалить неудовлетворительные оценки из списка.
 */

public class TaskA1 {
    public static void main (String[] args) {
        outA(selector(generator()));
    }
    private static ArrayList generator (){
        ArrayList list = new ArrayList();
        for (int i=0; i<100; i++) {
            list.add((int)(Math.random() * 100));
        }
        return list;
    }
    private static ArrayList selector (ArrayList<Integer> list){
        for (int i = 0; i<list.size(); i++){
            if(list.get(i)<40){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    private static void outA (ArrayList list){
        for (int i=0; i<list.size();){
                for (int j = 0; j < 10 && i<list.size(); j++, i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
        }
    }
}