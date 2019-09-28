package nsivko.lab2;

public class TaskA1 {
    public static void main(String[] args) {
        double m = 22, n = -2;
        double raz1 = m - 10, raz2 = n - 10, mraz1, mraz2;
        mraz1 = Math.abs(raz1);
        mraz2 = Math.abs(raz2);
    if ( mraz1 > mraz2 ) {
            System.out.println("Число " + n + " ближе к 10");
        } else if (mraz1 == mraz2){
            System.out.println("Числа " + n + " и " + m + " близки к 10");
        }
           else {
        System.out.println(" Число " + m + " ближе к 10");
      }
    }
}
