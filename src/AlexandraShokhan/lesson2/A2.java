package AlexandraShokhan.lesson2;

public class A2 {
    public static void main(String[] args) {
    double a = 1;
    double b = -8;
    double c = 15;
    double d = Math.pow(b, 2) - 4 * a * c;
    if (d < 0) {
        System.out.println("Equation has no roots");
    } else {
        double root1 = (-b + Math.sqrt(d)) / (2 * a);
        double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);
    }
    }
    }
