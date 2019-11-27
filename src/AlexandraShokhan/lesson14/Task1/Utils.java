package AlexandraShokhan.lesson14.Task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static int getRandomBook(ArrayList listOfBooks) {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(listOfBooks.size());
        return index;
    }
    public static int getRandomNum(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
