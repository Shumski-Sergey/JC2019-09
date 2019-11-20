package ilyaSakalouski.K_R_20_11_19.Task_3;

import java.util.*;

class Numbers {
    void getMaxValue() {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int addresult = random.nextInt(5);
            integers.add(addresult);
        }
        System.out.println(integers);

        Set<Integer> unique = new HashSet<>(integers);
        for (Integer x : unique) {
            System.out.println("Число " + x + ": " + Collections.frequency(integers, x));
        }
    }
}

