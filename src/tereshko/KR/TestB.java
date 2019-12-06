package tereshko.KR;


import java.util.Arrays;


public class TestB {
    public static void main(String[] args) {
        int[] mas = new int[8];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*20);
        }
        for (int i = 0; i <=mas.length-1; i++) {
            if(i%2 == 0){
                mas[i] = mas[i++];
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
