package asenyuk.Exam.Task3;

import java.util.ArrayList;

public  class random {
    final static int MAX_NUMBER = 10;
    public static int numb;

  static   int   genericNumbs() {
        return numb = (int) (Math.random() * MAX_NUMBER);
    }

}