package ilyaSakalouski.Utility_Test;

import static ilyaSakalouski.Different_Utility.UtilityForCollections.getRandomNumber;

public class TestUtil {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(getRandomNumber(0, 10) + " ");
        }
    }
}
