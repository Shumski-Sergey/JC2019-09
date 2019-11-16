package asenyuk.Lesson7.Task2;

public class Catalog <T> {
    private T [] catalog;

    public T getcatalog(int i) {
        return catalog[i];
    }

    public void setcatalog(T[] arr) {
        this.catalog = catalog;
    }

    public void showcatalog (int a) {

        System.out.println("catalog "  + catalog[a]);
    }
}
