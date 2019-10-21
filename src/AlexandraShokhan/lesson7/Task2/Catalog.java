package AlexandraShokhan.lesson7.Task2;

import java.util.ArrayList;

public class Catalog<T> {

    T[] catalogContent;

    public void setCatalogContent(T[] catalogContent) {
        this.catalogContent = catalogContent;
    }

    public T[] getCatalogContent() {
        return catalogContent;
    }

    public void catalogContentPrintFirst5(T[] catalogContent) {
        ArrayList<T> Array = new ArrayList<>();
        for (int i = 0; i <= catalogContent.length - 1; i++) {
            Array.add(catalogContent[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Array.get(i));
        }
    }
}
