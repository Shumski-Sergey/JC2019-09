package yKuzMinskij.Lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Написать ф-ю, которая сохранит содержимое каталога(class Catalog<T>) в массив
 * и выведет первые 5 элементов на экран.
 */

public class TaskA2 {
    public static void main (String[] args) {
        Catalog cat1 = new Catalog();
        System.out.println("Введите 10 имен своих знакомых и их возраст ");
        for (int i= 0; i<10; i++){
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        cat1.setItem(name);
        System.out.println("Введите возраст");
        Integer age = sc.nextInt();
        cat1.setItem(age);
        }
        ArrayList booksCatalog = cat1.gerList();
        for (int i = 0; i<10; i+=2){
            System.out.print("\nИмя : " + booksCatalog.get(i) + " // Возраст : " + booksCatalog.get(i+1));
        }
    }
}
class Catalog<Object>{
    private Object item;
    private ArrayList <Object> list = new ArrayList<>();
    void setItem (Object item){this.item = item;
    this.list.add(this.item);}
    public ArrayList<Object> gerList (){return this.list;}
}