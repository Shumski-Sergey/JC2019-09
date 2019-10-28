package nsivko.utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CreateArrayListRandom {
    int size;

    public CreateArrayListRandom(int lenght) {
        this.size = lenght;
    }


    public ArrayList<Integer> createArrayNumber(int lenght) {
        ArrayList<Integer> arrayNumber = new ArrayList<>();
       for(int i = 0; i < lenght; i++) {
       int random = (int) (Math.random() * 100);
        arrayNumber.add(random);
     }
    return arrayNumber;
    }

    public ArrayList<Integer> createArrayNumberRandom(int lenght) {
        ArrayList<Integer> arrayNumber = new ArrayList<>();
        for(int i = 0; i < lenght; i++) {
            Random randomBig = new Random();
            int random = randomBig.nextInt();
            arrayNumber.add(random);
        }
        return arrayNumber;
    }

    public LinkedList<Integer> createLinkedNumberRandom(int lenght) {
        LinkedList<Integer> linkedNumber = new LinkedList<>();
        for(int i = 0; i < lenght; i++) {
            Random randomBig = new Random();
            int random = randomBig.nextInt();
            linkedNumber.add(random);
        }
        return linkedNumber;
    }

}
