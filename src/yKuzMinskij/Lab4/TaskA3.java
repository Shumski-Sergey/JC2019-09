package yKuzMinskij.Lab4;
    /**Создать массив, заполнить его случайными элементами, распечатать,
    *перевернуть, и снова распечатать (при переворачивании нежелательно создавать
    *еще один массив).
    */
public class TaskA3 {
    public static void main (String[] args) {
        int[] numsArray = creatingNumsArray();
        outputArray1(numsArray);
        System.out.println("\n\n");
        outputArray2(numsArray);
    }
    public static int[] creatingNumsArray (){
        int[] numArray=new int[100];
        for (int i=0; i<numArray.length; i++){
            numArray [i]= (int) (Math.random()*100);
        }
        return numArray;
    }
    public static void outputArray1 (int[] numsArray){
        for (int i=0; i<numsArray.length;){
            for(int k=0; k<10; k++){
                System.out.print(numsArray[i] + " ");
                i++;
            }System.out.println();
        }
    }
    public static void outputArray2 (int[] numsArray){
        for (int i = (numsArray.length - 1); i>0;){
            for (int k=0; k<10; k++){
                System.out.print(numsArray[i] + " ");
                --i;
            }System.out.println();
        }
    }
}
