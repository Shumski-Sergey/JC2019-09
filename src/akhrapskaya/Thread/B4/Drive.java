package akhrapskaya.Thread.B4;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

class Drive{

    private static final int BUS_COUNT = 3;
    private ArrayList<BusStop> busStops;
    private Semaphore semaphore = new Semaphore(BUS_COUNT);
    private Random random = new Random();

    Drive(ArrayList<BusStop> busStops){
        this.busStops = busStops;
    }

     void drive(int i) throws InterruptedException {
            Thread.currentThread().setName("Автобус №" + i);
            for (BusStop busStop: busStops ){
                System.out.println(Thread.currentThread().getName() + ": Подъехал к остановке " + busStop.getName());
                semaphore.acquire();
                busStop.stop(random.nextInt(6)+1);
                semaphore.release();
                Thread.sleep(random.nextInt(6)+1);
            }
    }
}
