package nsivko.lab2;

public class TaskA2 {
    public static void main(String[] args) {
        double A = 1, B = -2, C = -1;
        double D, d, x1, x2;
        System.out.println("Уравнение (" + A + ") * x^2 + (" + B + ") * x + (" + C + ") = 0");
        D = B * B - 4 * A * C;
        if (D >= 0){
            if (D == 0){
                x1 = (-B) / (2 * A);
                System.out.println("Имеет один корень x = " + x1);
            } else {
            d = Math.sqrt(D);
            x1 = ( -B + d) / (2 * A);
            x2 = ( -B - d) / (2 * A);
            System.out.println("Имеет корни x1 = " + x1 + " и x2 = " + x2);
        }
           } else {
            System.out.println("Корней не имеет");
        }
    }
}
