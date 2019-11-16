package nsivko.lab9.Task2;

import java.util.ArrayList;

import static nsivko.utils.CreateArrayListRandom.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        int elementNumber = getStudentNumber();
        ArrayList<Integer> elementsArray;
        elementsArray = createArrayNumber(elementNumber);

        System.out.print("Все элементы: ");
        printArrayNumber(elementsArray);
        removeSameElements(elementsArray);

        System.out.print("\nВсе элементы без повторяющихся: ");
        printArrayNumber(elementsArray);
    }
}

