package AlexandraShokhan.lesson4;

// 4.Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
//т.е таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1

public class Task5 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        int[][] newArray;
        newArray = new int[rows][columns]; // Создаем двухмерный массив.


        for (int i = 0; i < rows / 2 + 1; i++) {  //идём по строкам
            for (int j = 0; j < columns; j++) {//идём по столбцам
                if (( j < i) || (j >= (columns - i)))
                    newArray[i][j] = 0;
                else
                    newArray[i][j] = 1;
            }
        }

        for (int i = rows - 1; i >= rows / 2; i--) {
            for (int j = 0; j < columns; j++) {
                if ((j < (columns - 1 - i)) || (j > i))
                    newArray[i][j] = 0;
                else
                    newArray[i][j] = 1;
            }
        }

        printTwoDimArray(newArray); // Печатаем двухмерный массив.
    }



 // Метод, который печатает двухмерный массив.
    public static void printTwoDimArray(int array[][]) {
        for (int i = 0; i <= array.length - 1; i++) {  //идём по строкам
            for (int j = 0; j <= array[0].length - 1; j++) {//идём по столбцам
                System.out.print(" " + array[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
}
