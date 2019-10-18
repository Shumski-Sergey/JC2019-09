package AlexandraShokhan.lesson6.Task3;

// 3.Создать иерархию классов, описывающих бытовую технику. Создать
//несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Appliances {
    public static void main(String[] args) {
        KitchenAppliance dishwasher = new KitchenAppliance
                ("Dishwashing machine", 4,false, true);
        KitchenAppliance kettle = new KitchenAppliance
                ("Electric kettle", 1, false, false);
        BathroomAppliance washingMachine = new BathroomAppliance
                ("Washing machine", 3, true, false);
        BathroomAppliance toothbrush = new BathroomAppliance
                ("Electric toothbrush", 0, false, true);
        ElectricalAppliance television = new ElectricalAppliance
                ("Television", 6, true);

        dishwasher.plugIn();
        kettle.plugIn();
        washingMachine.plugIn();
        toothbrush.plugIn();
        television.plugIn();

    }
}

class ElectricalAppliance implements PlugIn{
String type;
int howOld;
boolean isPluggedIn;

    // Конструктор
public ElectricalAppliance (String type, int howOld, boolean isOn) {
    this.type = type;
    this.howOld = howOld;
    this.isPluggedIn = isOn;
    }

    @Override
    public void plugIn() {
            if (isPluggedIn == true) {
                System.out.println(type + " is already plugged in.");
            } else {
                isPluggedIn = true;
                System.out.println(type + " has been plugged in.");
            }
    }
}

class KitchenAppliance extends ElectricalAppliance{
boolean isBuildIn;
    public KitchenAppliance(String type, int howOld, boolean isOn, boolean isBuildIn) {
        super(type, howOld, isOn);
        this.isBuildIn = isBuildIn;
    }
}

class BathroomAppliance extends ElectricalAppliance {
    boolean isPrivate;
    public BathroomAppliance(String type, int howOld, boolean isOn, boolean isPrivate) {
        super(type, howOld, isOn);
        this.isPrivate = isPrivate;
    }
}
