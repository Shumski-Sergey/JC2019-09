package nbogdan.Lesson4.TaskA;

public class TaskA1 {
    public static void main(String[] args) {
        int x = 1000, n = 0;
        for (; x < 10000;) {
            System.out.print(x + " ");
            x +=3;
            n++;
        }
        System.out.print("\n");
        int[]   mass = new int[n + 1];
        x = 1000;
        n = 0;
        for (; x < 10000;) {
            mass [n] = x;
            n++;
            x += 3;
        }

        System.out.print("А теперь массивом: ");
        for (int a: mass) {System.out.print(a + " ");}
        System.out.println("Размерность" + n);
    }
}
