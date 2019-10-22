package AlexandraShokhan.lesson7.TaskB1;

// B1. Написать метод для конвертации массива строк/чисел в список.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Convertion myConvertion = new Convertion();
        Integer arrayInteger[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myConvertion.setArray(arrayInteger);
        ArrayList output = new ArrayList();
        output = myConvertion.convertArrayToList(myConvertion.getArray());
        output.add("text");
        output.add(37.99);
        System.out.println(output);
    }
}


