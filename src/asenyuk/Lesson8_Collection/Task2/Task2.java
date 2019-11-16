package asenyuk.Lesson8_Collection.Task2;

import java.util.ArrayList;

public class Task2 {
    int numb;
    int genericNumbs () {
        return numb=(int)( Math.random() *10 +5) ;
    }

    ArrayList<Integer> ganericNumbers() {
        ArrayList <Integer> numbs = new ArrayList<>();
        for (int i=0;i<genericNumbs();i++) {
            numbs.add(genericNumbs());

        }
        return  (numbs);
    }

}
