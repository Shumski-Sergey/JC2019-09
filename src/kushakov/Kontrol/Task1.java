package kushakov.Kontrol;
import java.util.Arrays;
/**
 * Created by user on 20.11.2019.
 */
public class Task1 {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int[] ww = {0,1, 2, 3, 4, 6, 7, 8,9};
        for (int i = 0; i < ww.length; i++) {
            if (max < ww[i]) {
                max = ww[i];
            }
        }
        System.out.println("Крупное число = " + max);
        for (int i = 0; i < ww.length; i++) {
            if (min > ww[i]) {
                min = ww[i];
            }
        }
        System.out.println("Мелкое число = " + min);
        int sum = 0;
        for(int i=0; i<ww.length;i++){
            sum=sum+ww[i];
        }
        System.out.println("Сумма чисел = " + sum);
    }
}