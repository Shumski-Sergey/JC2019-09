package dmikulionak.lesson_4;

public class task_a4 {
    public static void main (String[] args) {
        int[] array = new int[20];
        int x = 2;
        for (int i = 0; i < 20; i++) {
            array[i] = x;
            x = x + x;
            System.out.print(array[i] + " ");
        }
    }
}



