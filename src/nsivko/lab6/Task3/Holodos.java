package nsivko.lab6.Task3;

public class Holodos extends Technika {

    Holodos(String tColor, double tP) {
        super(tColor, tP);
    }

    public void mesto(String name){
        System.out.println(name + " стоит в углу комнаты.");
    }
}
