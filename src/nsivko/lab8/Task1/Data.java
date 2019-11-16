package nsivko.lab8.Task1;

public class Data<T> {

    private T[] elements;

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    public void printElementMassive(int i) {
        System.out.println("Элемент " + (i+1) + " равен " + elements[i]);
    }
}
