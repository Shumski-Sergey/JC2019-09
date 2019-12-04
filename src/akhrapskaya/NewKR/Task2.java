package akhrapskaya.NewKR;

public class Task2 {

    private  static int[] Array = {20, 20, 25, 60, -52, -30, 102, -4};

    public static void main(String[] args) {
       for( int i =1 ; i < Array.length; i++){
            if(i%2 == 0)
                Array[i]= Array[i-1];

       }
       for (int i : Array)
            System.out.print(i + " ");
        System.out.println();
    }
}
