package zyahya;

public class SqrRoot {
    public static void main(String[] args){
        double a=1;
        double b=2;
        double c=1;
        double d=Math.pow(b,2)-4*a*c;
        double x=(-b +Math.sqrt(d))/2*a;
        double y=(-b-Math.sqrt(d))/2*a;
        if(d<0){
            System.out.println("Корней нет");
        }
        if(d>0){
            System.out.println("Корни уровнения " +x+ " и " +y);

        }
        if(d==0){
         System.out.println("Корень уравнения " +x);
        }
    }
}
