package asenyuk.Lesson7.Task1;

public class ArrayT <T> {
    private T [] arr;

    public T getArr(int i) {
        return arr[i];
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public void showArray (int a) {

        System.out.println("Array "  + arr[a]);
    }
}
