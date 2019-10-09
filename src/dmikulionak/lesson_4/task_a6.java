package dmikulionak.lesson_4;

public class task_a6 {
        public static void main(String[] args) {
            int[] array = new int[1000];
            int x = -166;
            for (int i = 0; i < 1000; i++) {
                array[i] = x;
                x = 2 * x + 200;
                if(array[i]>=-99 && array[i]<=-10)
                    System.out.print(array[i] + " ");
                else if (array[i]<=99 && array[i] >= 10){
                    System.out.print(array[i] + " ");
                }
            }
        }
}
