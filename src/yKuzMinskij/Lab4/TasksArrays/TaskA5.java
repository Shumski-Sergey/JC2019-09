package yKuzMinskij.Lab4.TasksArrays;
    /**
     * Выведите на экран все члены последовательности 2an-1–1, где a1=2, которые меньше 10000.
     */
public class TaskA5 {
    public static void main (String[] args) {
        outputArray(arrayCreating(checkSize()));
    }
    public static int checkSize (){
        int size=0;
        int res=0;
        while (res<10000){
            int a = 2;
            res+=2*a-1-1;
            a++;
            size++;
        }
        return size;
    }
    public static int[] arrayCreating (int size){
        int [] numsArray = new int[size];
        int a = 2;
        for (int i=0; i<numsArray.length; i++){
            numsArray[i] = 2*a-1-1;
            a++;
        }
        return numsArray;
    }
    public static void outputArray(int [] numsArray){
        for (int i=0; i<numsArray.length;){
            for (int k=0; k<10; k++, i++){
                System.out.print(numsArray[i] + " ");
            }System.out.println();
        }
    }
}
