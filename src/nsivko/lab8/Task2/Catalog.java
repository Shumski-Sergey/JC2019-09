package nsivko.lab8.Task2;

public class Catalog<T> {
    private T[] catalog;


    public T[] getCatalog() {
        return catalog;
    }

    public void setCatalog(T[] catalog) {
        this.catalog = catalog;
    }
}
