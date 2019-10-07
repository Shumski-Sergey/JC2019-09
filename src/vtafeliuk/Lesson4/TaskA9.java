package vtafeliuk.Lesson4;
//Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.
public class TaskA9 {
    public static void main(String[] args) {

        for (int a = 2; a < 10000; a = 2*a-1) {
            System.out.println(a);
        }

    }
}
