package vtafeliuk.Lesson6.Tech;

public class Action {
    public static void main(String[] args) {
        Item fridge = new Item("Bosh", 1500,1500,true,36,"Freezing", "Iron", "fridge");
        Item brokenKettle = new Item("LG", 2000, 160,false,12,"boiling", "Glass", "brokenKettle");
        Item okKettle = new Item("LG", 1500, 260,true,12,"boiling", "Ceramics", "okKettle");
        Item oven = new Item("Atlant", 3500,1560,false,24,"warming up", "Iron", "oven");

        System.out.println("Состояние питиния " + oven.name + " от сети: ");
        oven.isPluggedIn(oven.plugIn);
        oven.turnOffItem(oven.plugIn);
        oven.isPluggedIn(oven.plugIn);
        oven.turnOnItem(oven.plugIn);
        oven.isPluggedIn(oven.plugIn);

        fridge.isPluggedIn(fridge.plugIn);


    }

}
