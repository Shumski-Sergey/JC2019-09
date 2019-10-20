package akhrapskaya.Lesson6.Appliances;

public class Fridge extends LargeSize{
    private final static String NAME = "Холодильник";
    private String m;
    private Fridge(String m, int power) {
        super(power);
        this.m =m;
    }
    private String getM(){
        return m;
    }
    @Override
    protected void info(){
        System.out.println("Я - " + NAME + " фирмы " + getM());
        super.info();
    }
    private void washTime(){
        System.out.println("Меня пора помыть!");
    }
    public static void  main(String[] args){
        Fridge f1 = new Fridge("LG", 500);
        f1.setSize(200, 60);
        f1.turnOn();
        f1.washTime();
        f1.info();
        Fridge f2 = new Fridge("Samsung", 700);
        f2.setSize(180, 70);
        f2.info();
    }
}

