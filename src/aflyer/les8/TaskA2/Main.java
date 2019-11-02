package aflyer.les8.TaskA2;

import aflyer.les8.TaskA2.Catalog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

//Написать ф-ю, которая сохранит содержимое каталога(class Catalog<T>) в массив и выведет первые 5 элементов на экран.
public class Main {
    public static void main(String[] args) {
        Catalog<ArrayList> Box = new Catalog<>();
        ArrayList massiv = new ArrayList();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество элементов массива:");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                massiv.add(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Box.setItem(massiv);
        System.out.println("Введите количество элементов для вывода:");
        int j = sc.nextInt();
        showFirstElements(Box.getItem(), j - 1);

    }

    private static void showFirstElements(ArrayList newMass, int j) {
        for (int i = 0; i <= j; i++) {

            System.out.println(newMass.get(i).toString());
        }
    }


}