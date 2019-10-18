package ilyaSakalouski.lesson_6_and_7.HouseTechnics;

public class Served extends Sclass {
private int packetSize;
    protected Served(int power, double weight, String name, int packetSize) {
        super(power, weight,name);
        this.packetSize = packetSize;
    }
    @Override
    protected void Say(){
        super.Say();
        System.out.println("Размер мешка для мусора: " + packetSize + " кг.");
    }
}


