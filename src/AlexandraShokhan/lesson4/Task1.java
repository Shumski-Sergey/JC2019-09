package AlexandraShokhan.lesson4;

// 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class Task1 {
    public static void main(String[] args) {
        int counter = 1;
        int firstNumber = 1000;
        int lastNumber = 9999;

        for (int i = 1000 ; i <= lastNumber; i+=3) {
            counter++;
            System.out.println(i);
        }

        /* int [] array;
        array = new int[counter];

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = firstNumber + 3;
            firstNumber = array[i];
        }

        for (int i = 0; i<= array.length - 1; i++) {
           System.out.println(array[i]);
        }

         */
    }
}
