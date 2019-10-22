package ilyaSakalouski.lesson_8;
// Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
// Реализовать метод, который возвращает любой элемент массива по индексу.

public class Catalog<M> {
    private M[] mass;

    public void setMass(M[] mass) {
        this.mass = mass;
    }

    M getMass(int id) {
        return mass[id];
    }
}

