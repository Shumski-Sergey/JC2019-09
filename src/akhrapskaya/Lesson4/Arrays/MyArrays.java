package akhrapskaya.Lesson4.Arrays;

public class MyArrays {
    public int [] array;
    public int n;

    public MyArrays( int n){
        this.n = n;
        array = new int[n];
    }
    public MyArrays(){
        this.n = 0;
        array = new int[n];
    }
    public void output( int k){
        for (int i = 0; i < array.length; i++){
            if(i % k == 0)
                System.out.print("\n");
            System.out.print(array[i] + " ");
        }
    }
    public void output(){
        for (int i : array){
            System.out.print(i + " ");
        }
    }

}
