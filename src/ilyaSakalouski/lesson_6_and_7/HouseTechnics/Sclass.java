package ilyaSakalouski.lesson_6_and_7.HouseTechnics;

public class Sclass {
    private int power;
    private double weight;
    private String name;

    protected Sclass(int power, double weight, String name) {
        this.power = power;
        this.weight = weight;
        this.name = name;
    }

    protected void Say() {
        System.out.println("Я " + name + ". Моя мощность: " + power + "kW. Мой вес: " + weight + "кг.");
    }

    protected void On() {
        System.out.println("Я готов к работе.");
    }

    protected void Off() {
        System.out.println("Нет питания!");
    }
}

