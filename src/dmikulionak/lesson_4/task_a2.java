package dmikulionak.lesson_4;

public class task_a2 {
    public static void main (String[] args) {
        int[] array = new int[55];
        int x = 1;
        for (int i = 0; i < 55; i++) {
            array[i] = x;
            x = x + 2;
            System.out.print(array[i] + " ");
        }
    }
}
