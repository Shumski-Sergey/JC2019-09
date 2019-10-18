package nsivko.lab6.Task3;

public class Toster extends Holodos {

    Toster(String tColor, double tP) {
        super(tColor, tP);
    }
     @Override
     public void mesto(String name){
         System.out.println(name + " стоит на столе.");
    }

}
