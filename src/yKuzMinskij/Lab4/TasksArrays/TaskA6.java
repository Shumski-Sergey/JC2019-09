package yKuzMinskij.Lab4.TasksArrays;

/**
 * Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.
 */

public class TaskA6 {
    public static void main (String[] args) {
        outputArray(arrayCreating(checkSize()));
    }
    private static int checkSize (){
        int size=0;
        int res=0;
        int a = -166;
        while (res<100){
            res=2*a-1+200;
            a++;
            if (res>-100&&res<100){
            size++;
            }
        }
        return size;
    }
    private static int[] arrayCreating (int size){
        int [] numsArray = new int[size];
        int a = -166;
        int res;
        for (int i=0; i<numsArray.length;){
            res=2*a-1+200;
            a++;
            if (res>-100&&res<100){
            numsArray[i] = res;
            i++;
            }

        }
        return numsArray;
    }
    private static void outputArray (int[] numsArray){
        for (int i=0; i<numsArray.length;){
            for (int k=0; k<10; k++, i++){
                System.out.print(numsArray[i] + " ");
            }System.out.println();
        }
    }
}

