package yKuzMinskij.Lab4;
//Определите сумму элементов массива, расположенных между минимальным
//и максимальным значениями.

public class TaskA2 {
    public static void main (String[] args) {
        sumOfNums();
    }
    public static int[] creatingNumsArray (){
        int [] numsArray = new int[100];
        for (int i=0; i<numsArray.length; i++){
            numsArray [i] = (int) (Math.random()*100);
        }return numsArray;
    }
    public static int minNumOfArray (int [] numsArray){
        int minNum=99;
        for (int i=0; i<numsArray.length; i++){
            if (numsArray[i]<minNum){
                minNum = numsArray[i];
            }
        }return minNum;
    }
    public static int maxNumOfArray (int [] numsArray){
        int maxNum=0;
        for (int i=0; i<numsArray.length; i++){
            if (numsArray[i]>maxNum){
                maxNum=numsArray[i];
            }
        }return maxNum;
    }
    public static int firstMinMaxNumPosition (int [] numsArray) {
        int firstMinMaxNumPosition=0;
        int minNum = minNumOfArray(numsArray);
        int maxNum = maxNumOfArray(numsArray);
        for (int i=1; i<numsArray.length; i++){
            firstMinMaxNumPosition = i;
            if (numsArray[i]==minNum || numsArray[i]==maxNum)break;

        }
        return firstMinMaxNumPosition+1;
    }
    public static int lastMinMaxNumPosition (int [] numsArray) {
        int lastMinMaxNumPosition = 0;
        int minNum = minNumOfArray(numsArray);
        int maxNum = maxNumOfArray(numsArray);
        for (int i = 1; i!=numsArray.length; i++) {
            if (numsArray[i]==minNum || numsArray[i]==maxNum)
                lastMinMaxNumPosition = i;

        }
        return lastMinMaxNumPosition+1;
    }
    public static void outputNumsArray(int[] numsArray) {
        for (int i=0; i<numsArray.length;){
            for(int k=1; k<=10; k++){
                System.out.print(numsArray[i] + " ");
                i++;
            }System.out.println();
        }
    }

    public static void sumOfNums (){
        int sumOfNums=0;
        int[] numsArray = creatingNumsArray();
        outputNumsArray(numsArray);
        for (int i=firstMinMaxNumPosition(numsArray); i<lastMinMaxNumPosition(numsArray); i++) {
            sumOfNums+=numsArray[i];
        }

        System.out.println("Сумма всех числел между первым минимальным/максимальным значением находящимся на позиции " +
                firstMinMaxNumPosition(numsArray)+ "\nи последним минимальным/максимальным значением находящимся " +
                "на позиции " + lastMinMaxNumPosition(numsArray) + "\nсоставляет "
                + sumOfNums);
        System.out.println("Минимальное число " + minNumOfArray(numsArray) + "" + "\nМаксимальное число " +
                maxNumOfArray(numsArray));
    }
}