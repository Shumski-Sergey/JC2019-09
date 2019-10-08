package vtafeliuk.Lesson4;

//Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class TaskA8 {
    public static void main(String[] args) {

        for (int i = 1, a = 2; i < 21; i++, a *=2) {
            System.out.print(a + " ");
        }
    }
}
