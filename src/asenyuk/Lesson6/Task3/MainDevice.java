package asenyuk.Lesson6.Task3;

public class MainDevice {

    public static void main(String[] args) {
        Refrigerator frige = new Refrigerator("LG",0,"Korea",500,-10);

       frige.parametrOfDevice();

       frige.switchOn();
       frige.increaseTemperature();

        frige.parametrOfDevice();
    }
}
