package ilyaSakalouski.lesson_6_and_7.HouseTechnics;

public class Served extends Sclass {
    private int packetSize;

    protected Served(int power, double weight, String name, int packetSize) {
        super(power, weight, name);
        this.packetSize = packetSize;
    }

    void Service() {
        System.out.println("Замените пакет!");
    }

    @Override
    protected void Say() {
        super.Say();
        System.out.println("Объём пакета для мусора: " + packetSize + " л.");
    }
}


