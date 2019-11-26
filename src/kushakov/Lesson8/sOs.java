package kushakov.Lesson8;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by user on 23.11.2019.
 */
public class sOs {
    public static int getRandomNum(int min, int max){ return ThreadLocalRandom.current().nextInt(min, max+1);}

    public static ArrayList<Integer> createrandomArrayslist(int Length, int min, int max) {
        ArrayList<Integer> radarr = new ArrayList<>();
        for (int i = 0; i < Length; i++){
            radarr.add(getRandomNum(min, max));
        }
        return radarr;
    }
}

