package aflyer.les8.TaskA1;
//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//Реализовать метод, который возвращает любой элемент массива по индексу.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Container<ArrayList> Box = new Container<>();
        ArrayList list = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элеметов массива:");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int n = i + 1;
            System.out.println("Введите " + n + "тый элемент");
            try {
                list.add(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        Box.setItem(list);
        System.out.println("Введите индекс элемента массива");
        int j = sc.nextInt();

        getItemByIndex(Box.getItem(), j - 1);


    }

    private static void getItemByIndex(ArrayList itemList, int j) {

        System.out.println(itemList.get(j).toString());
    }


}
