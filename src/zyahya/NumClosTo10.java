package zyahya;

public class NumClosTo10 {
    public static void main(String[] args){
        double m=12.5;
        double n=3.5;
        int a=10;
        double k=Math.abs(m-a);
        double f=Math.abs(n-a);
        if(k==f){
            System.out.println("Числа " +m +" и " +n+" равноудалены от " +a);
        }
        if(k>f){
            System.out.println("Число "+n +" ближе к "+a );
        }
        if(k<f){
            System.out.println("Число " +m+" ближе к "+a);
        }
    }
}
