package AlexandraShokhan.lesson7.Task2;

// 2. Написать ф-ю, которая сохранит содержимое
// каталога(class Catalog<T>) в массив и выведет первые 5 элементов на экран.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog myCatalog = new Catalog();
        String contentString[] = new String[]{"agenda", "fuel", "revival", "omission", "parameter", "hobby", "snake",
                "owner", "wheel"};
        myCatalog.setCatalogContent(contentString);
        myCatalog.catalogContentPrintFirst5(myCatalog.getCatalogContent());

        System.out.println("");

        Integer contentInteger[] = new Integer[]{111, 222, 333, 444, 555, 666, 777, 888, 999, 000};
        myCatalog.setCatalogContent(contentInteger);
        myCatalog.catalogContentPrintFirst5(myCatalog.getCatalogContent());
    }
}
