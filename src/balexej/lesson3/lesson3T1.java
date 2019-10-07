package balexej.lesson3;

public class lesson3T1 {
    public static void main(String[] arge) {

        int num = 2;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
