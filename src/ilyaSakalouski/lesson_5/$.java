package ilyaSakalouski.lesson_5;

public class $ {
    public static void main(String[] args) {
        int[][] butterfly = {{1, 1, 1}, {0, 1, 0}, {1, 1, 1}};
        for (int[] ints : butterfly) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
        }
    }
}
