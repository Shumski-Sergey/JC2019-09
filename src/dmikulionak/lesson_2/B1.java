package dmikulionak.lesson_2;
public class B1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 155;
        int random = a + (int) (Math.random() * b);
        System.out.println("Cлучайное число: " + random);
        if (random >= 25 && random<=100) {
            System.out.print(random + " попало в интервал 25:100 ");
        }
        else {
            System.out.print(random + " не попало в интервал 25:100");
        }
    }
}
