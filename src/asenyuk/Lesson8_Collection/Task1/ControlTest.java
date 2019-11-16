package asenyuk.Lesson8_Collection.Task1;

import java.util.ArrayList;

public class ControlTest {
    final int sizeClass=10;
    final  int minSatisfiedGrade=4;
int Grade;
    int genericGrades () {
        return Grade=(int)( Math.random() *10) ;
    }

    ArrayList <Integer> doContralTest() {
        ArrayList <Integer> Grades = new ArrayList<>();
        for (int i=0;i<sizeClass;i++) {
            Grades.add(genericGrades());

        }
    return  (Grades);
    }



}
