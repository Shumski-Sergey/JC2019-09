package kushakov.Lesson8;

import java.util.ArrayList;

public class TaskA1 {
    public static int main(String[] args) {
        ArrayList<Integer> mark = new ArrayList<>();
        int arrayListLength = 10;
        int min = 0;
        int max = 10;
        createmarkArrayasList (arrayListLength, max, min);
        System.out.println("Оценки" + mark);
        int badmark = 5;
        int g;
        for (g = 0; g < badmark;) {
           g++;
           if(g>badmark) {
               return g;
           }
           System.out.println(g);
       }
        return arrayListLength;
    }

    static ArrayList<Integer> createmarkArrayasList(int arrayListLength, int max, int min) {
        return null;
    }

}
