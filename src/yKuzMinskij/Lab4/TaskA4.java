package yKuzMinskij.Lab4;
    /**
    * Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
    *т.е таким образом:
    *1 1 1 1 1
    *0 1 1 1 0
    *0 0 1 0 0
    *0 1 1 1 0
    *1 1 1 1 1
    */

public class TaskA4 {
    public static void main (String[] args) {
        int [][] numArray = new int[5][5];
        for (int i=0; i<numArray.length/2+1; i++){
            for (int j=i; j<numArray.length-i; j++){
                numArray[i][j] = 1;
                numArray[numArray.length-i-1][j]=1;
            }

        }
        for (int i=0; i<=numArray.length-1; i++){
            for(int j=0; j<=numArray.length-1; j++){
            System.out.print(numArray[i][j]);
            }System.out.println();
        }
    }
}
