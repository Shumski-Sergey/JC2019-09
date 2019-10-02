package AlexandraShokhan.lesson2;

public class A3 {
    public static void main(String[] args) {
    int a = 15;
    int b = 49;
    int c = 8;
    int v; // This variable is used to temporally store other values.

    if (a < b) {
        v = a;
        a = b;
        b = v;
    }

    if (b < c) {
        v = b;
        b = c;
        c = v;
    }

    if (a < b) {
        v = a;
        a = b;
        b = v;
    }

    System.out.println(a + " " + b + " " + c);
    }
}
