package akhrapskaya.Thread.B4;

public class BusStop {

    private String name;

    BusStop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void stop(int waitTime) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": Происходит посадка пассажиров на остановке:" + name);
        Thread.sleep(waitTime*1000);
        System.out.println(Thread.currentThread().getName()  + ": двинулся дальше по маршруту");

    }
}
