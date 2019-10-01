package balexej;

public class TaskB1 {
    public  static  void  main ( String [] args ) {
        int a =  ( int ) ( Math . random () *  150  +  5 )  ;
        if (a >=  25  && a <=  100 ) {
            System.out.println (a +  " - cлучайно выбранное из отрезка [5; 155] целое число попало в интервал (25; 100) " );
        }
        else{
            System.out. println (a +  " - cлучайно выбранное из отрезка [5; 155] целое число не попало в интервал (25; 100) " );
        }
    }
}