package balexej.lesson5;

import java.util.Scanner;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
public class Task2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array  = new int[size];
        System.out.println("Введите строку:");

        for (int i = 0; i < size; i++){
       array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println (" " + array[i]);
        }


}
}