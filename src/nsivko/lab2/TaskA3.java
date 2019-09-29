package nsivko.lab2;

public class TaskA3 {
    public static void main(String[] args) {
        int A = 27, B = 25, C = 38;
        if (A > B) {
            if (A > C) {
                if (B > C) {
                    System.out.println(C + " " + B + " " + A);
                } else {
                    System.out.println(B + " " + C + " " + A);
                }
            } else {
                System.out.println(B + " " + A + " " + C);
            }
        } else {
            if (B > C) {
                if (A > C) {
                    System.out.println(C + " " + A + " " + B);
                } else {
                    System.out.println(A + " " + C + " " + B);
                }
            } else {
                System.out.println(A + " " + B + " " + C);
            }
        }

    }
}
