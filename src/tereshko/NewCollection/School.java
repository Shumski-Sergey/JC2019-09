package tereshko.NewCollection;

import static tereshko.NewCollection.Scan.setScanner;

abstract class School {
    private static int students;

    static int getStudents() {
        return students;
    }

    static void setStudents() {
        School.students = setScanner();
    }
}
