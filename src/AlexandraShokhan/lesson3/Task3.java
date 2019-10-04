package AlexandraShokhan.lesson3;

/*
3. Имеется целое число, следует вывести его в бухгалтерском формате.
Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
20023143 должно быть выведено как 20 023 143
*/

public class Task3 {
    public static void main(String[] args) {
        int inputNumber = 5746000;
        String str1 = Integer.toString(inputNumber);
        int length1 = str1.length();
        int numberOfSpaces = (int) Math.floor(length1 / 3);
        int counter = 0;

        StringBuilder str = new StringBuilder(Integer.toString(inputNumber));

        for (int i = str.length() - 3; counter < numberOfSpaces; i-=3) {
            str.insert(i, " ");
            counter++;
        }

        System.out.println(str);
    }
}