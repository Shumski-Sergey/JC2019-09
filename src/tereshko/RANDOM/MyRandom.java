package tereshko.RANDOM;

import java.util.Random;

public class MyRandom {
    private static Random randommark =new Random();
    public static int randomMark(){
        return randommark.nextInt(10);
    }
}
