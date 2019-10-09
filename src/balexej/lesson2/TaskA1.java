package balexej.lesson2;
public class TaskA1 {
    public static void main(String[] args) {
        double m = 8.5;
double n = 11.45;
int a = 10;
double b = Math.abs(a-m);
double v = Math.abs(a-n);
if(b == v) {
    System.out.println("Числа" + m + " и " + n + "равноудалены от числа" + a);
}    if(b > v){
        System.out.println ( n + " ближе к " + a);
    }
    else {
        System.out.println( m  + "ближе к " + a);

    }
}
    }

