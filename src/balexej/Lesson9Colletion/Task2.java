package balexej.Lesson9Colletion;
//2.Создать коллекцию, наполнить ее случайными числами. Удалить
   //     повторяющиеся числа.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i<10;i++){
            int a = (int)(Math.random()*10);
            num.add(a);
        }
System.out.println(num);
        Set<Integer> set = new HashSet<Integer>(num);
        num.clear();
        num.addAll(set);
        System.out.println(num);
    }
}
