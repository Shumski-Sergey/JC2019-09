package vtafeliuk.Lesson4;
//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
public class TaskA7 {
    public static void main(String[] args) {

        int a = 90;

        while (a > 0) {
            System.out.println(a + "");
            a -= 5;
        }
    }
}
