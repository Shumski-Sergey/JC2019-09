package vtafeliuk.Lesson4;

//2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

public class TaskA6 {
    public static void main(String[] args) {

        for (int a = 1, c = 1; c < 52; c++, a +=2 ) {
            System.out.print(a + " ");
        }
    }
}
