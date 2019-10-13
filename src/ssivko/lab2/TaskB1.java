package ssivko.lab2;

public class TaskB1 {
    public static void main(String[] args) {
        int f = (int)(Math.random()*150+5);
        if (f<=100 && f>=25){
            System.out.println("Число " + f + " попало в диапазон");
        }
        else {
            System.out.println("Число " + f + " не попало в диапазон");
        }


    }
}
