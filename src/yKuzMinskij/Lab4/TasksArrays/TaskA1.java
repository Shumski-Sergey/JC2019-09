package yKuzMinskij.Lab4.TasksArrays;
    /**
     * Создайте программу, выводящую на экран все четырёхзначные числа последовательности
     *1000 1003 1006 1009 1012 1015 ….
     */
public class TaskA1 {
    public static void main (String[] args) {
        arrOutput (arrayCreator());
    }
    public static int[] arrayCreator (){
        int [] numsArray = new int[3000];
        int x = 997;
        for (int i=0; i<numsArray.length; i++){
            x+=3;
            numsArray[i]=x;

        }
        return numsArray;
    }
    public static void arrOutput (int [] numsArray){
        for (int i=0; i<numsArray.length; ){
            for (int k=0; k<10; k++, i++){
            System.out.print(numsArray[i] + " ");
            }System.out.println();
        }
    }
}
