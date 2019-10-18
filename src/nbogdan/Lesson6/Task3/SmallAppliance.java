package nbogdan.Lesson6.Task3;

class SmallAppliance extends Appliance {
    private String type;
    SmallAppliance(String type, boolean energy, int power) {
        super(energy, power);
        this.type = type;
    }
    String getType() {
        return type;
    }
    void show() {
        System.out.printf("Тип: %x. Мощность: %x. Подключение к сети: %x", type, super.getPower(), super.getEnergy());
    }
}
