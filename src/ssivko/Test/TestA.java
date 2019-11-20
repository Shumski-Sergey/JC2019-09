package ssivko.Test;
import java.util.Arrays;

public class TestA {
    public static void main(String[] args) {
        int[] mass = new int[]{2, 2, 45, 55, 234, 23};
        int min = Arrays.stream(mass)
                .min().getAsInt();
        System.out.println(min);

        int max =  Arrays.stream(mass)
                .max().getAsInt();
        System.out.println(max);

        int sum = Arrays.stream(mass)
                .reduce(0, (acc, x) -> acc + x);
        System.out.println(sum - max - min);

    }

}
