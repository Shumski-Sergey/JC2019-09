package tereshko.NewCollection;

import java.util.Random;

import static tereshko.NewCollection.Numbs.GRADE;
import static tereshko.NewCollection.Numbs.TENTHOUSAND;

public class MyRandom {
    private static Random random = new Random();

    public static int randomMark() {
        return random.nextInt(GRADE);
    }

    public static int randomTenThousand() {
        return random.nextInt(TENTHOUSAND);
    }
}
