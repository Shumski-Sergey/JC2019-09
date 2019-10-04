package AlexandraShokhan.lesson3;

/*
3. Имеется целое число, следует вывести его в бухгалтерском формате.
Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
20023143 должно быть выведено как 20 023 143


public class Task3 {
    public static void main(String[] args) {
        int inputNumber = 56745678;
        int number = inputNumber;

        int counter = 0;

        while (number > 0) {
            counter++;
            number = number / 1000;
        }
        int[] array;
        array = new int[counter];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = inputNumber % 1000;
            inputNumber = inputNumber / 1000;
        }

        for (int j = array.length; j > 0; j--) {
            System.out.print(" " + array[array.length - j]);
        }
        }
    }
*/
public class Task3 {
    public static void main(String[] args) {
        int inputNumber = 5674560;
        int number = inputNumber;
        String str = Integer.toString(inputNumber);


        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i));
            if ((str.length() % 3 == 1) && (i == 0)) {
                System.out.print(" ");
            }
            System.out.print(str.charAt(i + 1));
            if ((str.length() % 3 == 2) && (i == 0)) {
                System.out.print(" ");
            }
                System.out.print(str.charAt(i + 2));
                if (str.length() % 3 == 0) {
                    System.out.print(" ");
                    i += 2;
                }
            }
        }
    }