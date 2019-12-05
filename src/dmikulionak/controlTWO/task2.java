package dmikulionak.controlTWO;

import java.util.Arrays;

////Заменить каждый элемент массива с четным номером на соседний слева элемент.
public class task2 {
    public static void main(String[] args) {
        int [] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for( int i =0 ; i < array.length; i++){
            try {
                if(i%2 == 0)
                    array[i]= array[i-1];
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("В случае с нулевым индексом получили отрицательный индекс, но ничего страшного");
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

