package AlexandraShokhan.lesson3;

public class Task3 {
    public static void main(String[] args) {
        int inputNumber = 567456;
        int var = inputNumber;
        int number = inputNumber;
        int outputNumber;
        int counter = 0;

        while (number > 0) {
            counter ++;
            number = number / 1000;
            System.out.println(counter);
        }
        int[] array;
        array = new int[counter];

        for (int i = array.length; inputNumber > 0; i--) {
            var = inputNumber % 1000;
            inputNumber = inputNumber / 1000;
            array[i] = var;
            System.out.print(array);
        }

    }
}
