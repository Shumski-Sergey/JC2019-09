package Tereshko.Lesson4;

public class Test1_2 {
    public static void main(String[] args) {
        int []a=new int[1000];
        int j=0;
        for (int i =1; i <=300 ; i+=2) {
            a[j] = i;
            j++;

        }
        j=0;
        for (int i = 0; i <=55 ; i++) {
            System.out.println(a[i]);
            j++;
        }
        }
}
