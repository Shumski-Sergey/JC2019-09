package nsivko.lab9.Task2;

import nsivko.utils.CreateArrayListRandom;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов: ");
        Scanner size = new Scanner(System.in);
        int elementNumber = size.nextInt();

        CreateArrayListRandom elements = new CreateArrayListRandom(elementNumber);

        ArrayList<Integer> elementsArray;
        elementsArray = elements.createArrayNumber(elementNumber);
        System.out.print("Все элементы: ");
        printArrayNumber(elementsArray);
        removeElements(elementsArray);
        System.out.print("\nВсе элементы без повторяющихся: ");
        printArrayNumber(elementsArray);
    }

    private static void removeElements(ArrayList<Integer> assessmentArray) {
        for(int i = 0; i < assessmentArray.size()-1; i++) {
            for (int j = i+1; j < assessmentArray.size(); j++ )
            if (assessmentArray.get(i) == assessmentArray.get(j)) {
                assessmentArray.remove(j);
                j--;
            }
        }
    }

    public static void printArrayNumber(ArrayList<Integer> arrayNumber) {
        System.out.print(arrayNumber.get(0));
        for(int i = 1; i < arrayNumber.size(); i++) {
            System.out.print(", " + arrayNumber.get(i));
        }
    }


}

