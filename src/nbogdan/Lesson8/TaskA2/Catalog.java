package nbogdan.Lesson8.TaskA2;

class Catalog<T> {
    private Catalog<T> catalog;
    Catalog() {}
    Catalog(Catalog<T> catalog) {
        this.catalog = catalog;
    }
    public Catalog<T> getCatalog() {
        return catalog;
    }
    public void setCatalog(Catalog<T> catalog) {
        this.catalog = catalog;
    }
}
