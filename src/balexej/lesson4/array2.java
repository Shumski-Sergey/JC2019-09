package balexej.lesson4;

public class array2 {
    public static void main(String[]args){
        int [] array = {2,3,1,3,4,8,6,4,9,};
        int maxValue = array[0];
        int minValue = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i= 0; i<array.length; i++){
            if (array[i]>maxValue){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальный элемент " + maxValue);
        System.out.println("Интдекс " + maxIndex);

        for (int i = 0; i < array.length; i++){
            if (minValue > array[i]){
                minValue = array[i];
                minIndex = i;
                System.out.println("Минимальный элемент "+ minValue);
                System.out.println("Индекс " + minIndex);
            }
        }
        int sum = 0;
        for (int i = ++minValue; i < maxValue; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    }

