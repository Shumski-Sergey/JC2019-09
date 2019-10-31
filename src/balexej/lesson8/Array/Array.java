package balexej.lesson8.Array;

//1. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.)
// . Реализовать метод, который возвращает любой элемент массива по индексу.

public  class Array<T> {
    private T[] arr;

    public Array(T[] array) {
        this.arr = array;
    }

}
