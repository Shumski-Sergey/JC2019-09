package AlexandraShokhan.lesson7.Task1;

// 1. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
// Реализовать метод, который возвращает любой элемент массива по индексу.

class Main {
    public static void main(String[] args) {
        ItemsStorage integerArr = new ItemsStorage<Integer>();
        Integer[] integerArray = new Integer[]{4, 5, 8};
        integerArr.setArray(integerArray);

        ItemsStorage stringArr = new ItemsStorage<String>();
        String[] stringArray = new String[]{"hello", "welcome", "thanks"};
        stringArr.setArray(stringArray);

        integerArr.printElementByIndex(2);
        stringArr.printElementByIndex(0);
    }
}

class ItemsStorage<T> {
    private T[] array;

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getArray(int numberOfItems) {
        return array;
    }

    public void printElementByIndex(int index) {
        System.out.println(array[index]);
    }
}
