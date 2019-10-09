package yKuzMinskij.Lab4.TasksArrays;
    /**
     * Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
     */

public class TaskA2 {
    public static void main (String[] args) {
        outArr(arrayCrearing());
    }

    public static int[] arrayCrearing () {
        int[] numsArray = new int[100];
        int x = 1;
        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = x;
            x += 2;
        }
        return numsArray;
    }


    public static void outArr (int[] numsArray) {
        for (int i = 0; i < 55; ) {
            for (int k = 0; k < 10; k++, i++) {
                System.out.print(numsArray[i] + " ");
            }
            System.out.println();

        }
    }
}