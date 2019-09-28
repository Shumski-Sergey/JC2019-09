package AlexandraShokhan.lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class B1 {
    public static void main(String[] args) {
        int min = 5;
        int max = 155;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1); // Get a random number.

        if (randomNum > 25 && randomNum < 100) {
            System.out.println("The random number " + randomNum + " belongs to the segment (25; 100).");
       } else {
            System.out.println("The random number " + randomNum + " does not belong to the segment (25; 100).");
        }
    }
}
