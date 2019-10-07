package dmikulionak.lesson_4;

public class task_a5 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int x = 2;
        for (int i = 0; i < 20; i++) {
            array[i] = x;
            x = 2 * x - 1;
            if(array[i]<10000)
            System.out.print(array[i] + " ");
        }
    }
}
