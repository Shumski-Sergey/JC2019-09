package nbogdan.Lesson8.TaskA1;

import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Mass<Integer> mass = new Mass<>();
        Mass<Long> mass2 = new Mass<>();
        Random r = new Random();
        mass.setItemMass(new Integer[]{0,1,2,3,4,5,6,7,8,9});
        mass2.setItemMass(new Long[]{112763723L,123L,123L,124L,234L});
        for(int i = 0; i < 3; i++) {
            System.out.print(mass.getIndexMass(r.nextInt(10)) + " ");
        }
    }
}
