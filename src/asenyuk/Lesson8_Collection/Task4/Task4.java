package asenyuk.Lesson8_Collection.Task4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task4 {
    int numb4;
    int numb4l;
    int get4;
    final int sizeList=1000000;
    final int sizeGet=10000;

    int genericNumbs4 () {
        return numb4=(int)( Math.random() *10 ) ;
    }

    int genericGet ()  {
        return  get4=(int)( Math.random() *1000000 ) ;
    }

    int genericNumbs4l () {
        return numb4l=(int)( Math.random() *10 ) ;
    }

    ArrayList<Integer> ganericNumbers4() {
        ArrayList <Integer> numbs4 = new ArrayList<>();
        for (int i=0;i<=sizeList;i++) {
            numbs4.add(genericNumbs4());

        }
        return  (numbs4);
    }

    void getNumbers4(ArrayList<Integer> arraylist4) {
        for (int x=0;x<sizeGet;x++) {
               arraylist4.get(genericGet ());
        }
    // return arraylist4;
    }


    void getNumbers4l(LinkedList<Integer> linkedList4) {
        for (int y=0;y<sizeGet;y++) {
            linkedList4.get(genericGet ());
        }
        // return arraylist4;
    }

    LinkedList <Integer> ganericNumbers4L() {
        LinkedList <Integer> numbs4l = new  LinkedList<>();
        for (int i=0;i<=sizeList;i++) {
            numbs4l.add(genericNumbs4());

        }
        return  (numbs4l);
    }

}
