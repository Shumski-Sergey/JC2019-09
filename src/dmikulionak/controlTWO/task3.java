package dmikulionak.controlTWO;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

//3. Создать и заполнить файл случайными целыми значениями. Удалить все нечетные. Выполнить сортировку
// содержимого по возрастанию и вывести в другой файл(output).
public class task3 {

    public static void main(String[] args) throws IOException {
        util ut = new util();

        final String pathOne = "src/dmikulionak/controlTWO/one.txt";
        final String pathTwo = "src/dmikulionak/controlTWO/two.txt";

        PrintWriter writerOne = new PrintWriter(pathOne, StandardCharsets.UTF_8);
        PrintWriter writerTwo = new PrintWriter(pathTwo, StandardCharsets.UTF_8);

        int[] array = new int[10];
        ArrayList<Integer> numb = new ArrayList<>();
        ut.randomArray(array);
        for (int value : array) {
            writerOne.write(value + " ");
        }
        ut.evenArray(array);
        for (int value : array) {
            if (value != 0) {
                numb.add(value);
            }
        }
        Collections.sort(numb);
        for (int value : numb) {
            writerTwo.write(value + " ");
        }
        writerOne.close();
        writerTwo.close();
    }
}
