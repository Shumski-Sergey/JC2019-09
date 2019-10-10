package yKuzMinskij.Lab4.TasksArrays;
    /**
     *Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
     * */
public class TaskA4 {
    public static void main (String[] args) {
        outputArray(arrayCreating());
    }
    public static int[] arrayCreating (){
        int [] nmsArray = new int[20];
        int a =2;
        for (int i=0; i<nmsArray.length; i++){
            nmsArray[i]=a;
            a*=2;
        }
        return nmsArray;
    }
    public static void outputArray (int [] numsArray){
        for (int i=0; i<numsArray.length;){
            for (int k=0; k<10; k++, i++){
                System.out.print(numsArray[i] + " ");
            }System.out.println();
        }
    }
}
