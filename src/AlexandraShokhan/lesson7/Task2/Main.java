package AlexandraShokhan.lesson7.Task2;

// 2. Написать ф-ю, которая сохранит содержимое
// каталога(class Catalog<T>) в массив и выведет первые 5 элементов на экран.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog myCatalog = new Catalog();
        String contentString[] = new String[] {"agenda", "fuel", "revival", "omission", "parameter", "hobby", "snake",
                "owner", "wheel"};
        myCatalog.setCatalogContent(contentString);
        myCatalog.catalogContentPrintFirst5(myCatalog.getCatalogContent());

        System.out.println("");

        Integer contentInteger[] = new Integer[] {111, 222, 333, 444, 555, 666, 777, 888, 999, 000};
        myCatalog.setCatalogContent(contentInteger);
        myCatalog.catalogContentPrintFirst5(myCatalog.getCatalogContent());
    }
}


class Catalog<T> {

    T [] catalogContent;

    public void setCatalogContent(T[] catalogContent) {
        this.catalogContent = catalogContent;
    }

    public T[] getCatalogContent() {
        return catalogContent;
    }

    public void catalogContentPrintFirst5 (T[] catalogContent) {
        ArrayList <T> Array = new ArrayList<>();
        for (int i = 0; i <= catalogContent.length - 1; i++) {
            Array.add(catalogContent[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Array.get(i));
        }
    }
}
