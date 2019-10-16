package nbogdan.Lesson6.TaskA1;

public class CyberKiller extends SmallAppliance {
    private int killPotential;
    private String name;
    CyberKiller(String name, int killPotential, String type, boolean energy, int power) {
        super(type, energy, power);
        this.killPotential = killPotential;
        this.name = name;
    }
    @Override
    void show() {
        System.out.printf("Привет. Я %s C: Я %s с мощностью %s кВт. Я убью тебя примерно за %x мс, ", name, super.getType(), super.getPower(), killPotential);
        if (super.getEnergy()) {
            System.out.print("ведь я уже включен в розетку. Муа-ха-ха-ха\n");
        } else {
            System.out.print("только сначала, пожалуйста, включи меня в розетку ^.^\n");
        }
    }
}
