package nbogdan.Lesson8.TaskA1;

class Mass<T> {
    private T[] itemMass;
    T[] getItemMass() {
        return itemMass;
    }
    void setItemMass(T[] itemMass) {
        this.itemMass = itemMass;
    }
    T getIndexMass(int index) {
        return itemMass[index];
    }
}
