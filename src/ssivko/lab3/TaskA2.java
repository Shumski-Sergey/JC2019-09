package ssivko.lab3;

public class TaskA2 {
    public static void main(String[] args) {
        boolean d = true;
        int b = 13, a, f;
        for (a = 2; a < b; a++) {
            f=b%a;
            if (f==0) {
                System.out.println("Это непростое число");
                d = false;
                break;
            }
        }
        if (d == true){
            System.out.println("Это число простое");
        }
    }
}