package tereshko.Collection;

import java.util.Random;

import static tereshko.Collection.Numbs.GRADE;
import static tereshko.Collection.Numbs.TENTHOUSAND;

 class MyRandom {
    private static Random random = new Random();

     static int randomMark() {
        return random.nextInt(GRADE);
    }

     static int randomTenThousand() {
        return random.nextInt(TENTHOUSAND);
    }
}
