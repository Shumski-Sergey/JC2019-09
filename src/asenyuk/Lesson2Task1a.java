package asenyuk;

public class Lesson2Task1a {
    public static void main(String[] args) {
        double a =Math.round(Math.random() *100);
        double b = Math.round(Math.random() *100);
       final int c =10;

System.out.println("a = " + a);
System.out.println("b = " + b);

        double dif1 =Math.abs(c -a);
        double dif2 =Math.abs(c -b);

        System.out.println("dif1 = " + dif1);
        System.out.println("dif2 = " + dif2);

        if (dif1 ==dif2) {
            System.out.println("equal distances");
        } else if (dif1 >dif2) {
            System.out.println("b  closer");
        } else  {
            System.out.println("a closer");
        }

    }
}
