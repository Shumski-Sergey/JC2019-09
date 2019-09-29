package ssivko.lab2;

public class Q2 {
    public static void main(String[] args) {
        double A = 2, B = -4 , C = 2, D;
        double f, p, r;
        D = B*B - 4*A*C;
        System.out.println("Дано: (" + A + ") * x^2 + (" + B + ") * x + (" + C + ") = 0");
        if (D > 0){
            f = (-B + Math.sqrt(D))/(2*A);
            p = (-B - Math.sqrt(D))/(2*A);
            System.out.println("Два корня");
            System.out.println("Первый корень, равен: " + f);
            System.out.println("Второй корень, равен: " + p);
        }
        else if (D < 0){
            System.out.println("Нет корней ");
        }else if (D == 0){
            r = -B/(2*A);
            System.out.println("Один корень, равен: " + r);
        }
    }
}
