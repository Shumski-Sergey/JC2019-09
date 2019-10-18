package akhrapskaya.Lesson6.Appliances;

public class Fridge extends LargeSize{
    private final static String name = "Холодильник";
    //овроарплоап
    private Fridge(int power, int enCon) {
        super(power, enCon);
    }
    @Override
    protected void turnOn(){
        System.out.println("Я начал вырабатывать холод.");
    }

    private void washTime(){
        System.out.println("Меня пора помыть!");
    }
    public static void  main(String[] args){
        System.out.println("App:");
        App a1 = new App(350, 500);
        a1.turnOn();
        a1.turnOff();
        a1.match();
        System.out.println("LargeSize:");
        LargeSize l1 = new LargeSize(500, 400);
        l1.setSize(200, 60);
        l1.turnOn();
        l1.turnOff();
        l1.match();
        System.out.println("Fridge:");
        Fridge f1 = new Fridge(500, 400);
        f1.setSize(200, 60);
        f1.turnOn();
        f1.turnOff();
        f1.match();
        f1.washTime();
    }
}
