package nsivko.lab8.Task1;

import java.util.Random;

public class Task1 {
    public static final int size = 10;
    public static final int sizeNumber = 7;
    public static final int sizeString = 3;

    public static void main(String[] args) {

        Integer[] massiveNumber = massiveNumberInt();
        String[] massiveText = {"Minsk", "Grodno", "Brest"};

        Data<Integer> Numbers = new Data<>();
        Numbers.setElements(massiveNumber);

        Data<String> Text = new Data<>();
        Text.setElements(massiveText);

        int i = (int) (Math.random() * (sizeNumber - 1));
        int j = (int) (Math.random() * (sizeString - 1));

        Numbers.printElementMassive(i);
        Text.printElementMassive(j);


    }

    private static Integer[] massiveNumberInt() {
        Integer[] massiveNumber = new Integer[sizeNumber];
        for(int i = 0; i < sizeNumber ; i++) {
            massiveNumber[i] =(int) (Math.random() * 10);
        }
        return massiveNumber;
    }
}
