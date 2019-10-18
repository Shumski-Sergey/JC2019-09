package ssivko.lab6.Technics;

public class Fridge extends Technics {
    Fridge(){
        super("White", 65, "rectangle", "AA+");
    }
    public void noise(){
        System.out.println("Очень тихий ");
    }
}
