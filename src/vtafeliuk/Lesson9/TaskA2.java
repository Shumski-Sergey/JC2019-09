package vtafeliuk.Lesson9;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int arraySize = sc.nextInt();
        Random rd = new Random();

        for (int i = 0; i < arraySize; i++) {
            marks.add(rd.nextInt(10));
        }
        System.out.println(marks);

        List<Integer> marksUnique = new ArrayList<Integer>(new LinkedHashSet<Integer>(marks));
        System.out.println(marksUnique);


    //    for (int i = 0; i < marks.size(); i++) {
     //       if (!marksUnique.contains(marks.get(i)))
     //           marksUnique.add(i);
     //   }
      //  System.out.println(marksUnique);
    }


///доделать
}
