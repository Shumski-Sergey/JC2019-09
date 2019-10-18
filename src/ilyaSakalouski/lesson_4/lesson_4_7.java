package ilyaSakalouski.lesson_4;

public class lesson_4_7 {
    public static void main(String[] args) {
     int[] mass = new int[4];
     mass[0]  = 3;
     mass[1] = 5;
     mass[2] = 2;
     mass[3] = 2;
     int sum = 0;
        for (int i = 0; i <mass.length ; i++) {
            sum += mass[i];
        }
        System.out.println(sum);
    }
}
