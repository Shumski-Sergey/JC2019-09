package akhrapskaya.KR;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {

    public static void  main(String[] args){
         System.out.println("Введите элементы массива:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Integer> array = getArrayList(str);
        if (array.isEmpty()){
            System.out.println("Не корректно ввели данные!");
        }
        else {
            removeMinMax(array);
            System.out.println("Сумма остальных элементов = " + getSumOfArray(array));

        }
    }

    private static Integer getSumOfArray(ArrayList<Integer> array) {
        return array.stream().reduce(0, Integer::sum);
    }

    private static void removeMinMax(ArrayList<Integer> array) {
        System.out.println("Max = " + array.get(array.size() - 1));
        System.out.println("Min = " + array.get(0));
        array.remove(0);
        array.remove(array.size()-1);
    }

    private static ArrayList<Integer> getArrayList(String str) {
        return Arrays.stream(str.split(" +"))
                    .filter(s -> s.matches("-?\\d+"))
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new));
    }
}
