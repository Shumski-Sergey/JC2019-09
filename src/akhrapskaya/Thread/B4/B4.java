package akhrapskaya.Thread.B4;


import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class B4 {
    private static final int BUS_NUMBERS = 6;

    public static void main(String[] args) throws InterruptedException {
        Drive drive = new Drive(setBusStops());
        ExecutorService executorService = Executors.newFixedThreadPool(BUS_NUMBERS);
        for (int i = 0; i < BUS_NUMBERS; i++){
            int finalI = i;
            executorService.submit(() -> {
                try {
                    drive.drive(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }

    private static ArrayList<BusStop> setBusStops() {
        ArrayList<BusStop> busStops = new ArrayList<>();
        busStops.add(new BusStop("Первая остановка"));
        busStops.add(new BusStop("Вторая остановка"));
        busStops.add(new BusStop("Третья остановка"));
        busStops.add(new BusStop("Четвертая остановка"));
        busStops.add(new BusStop("Пятая остановка"));
        return busStops;
    }
}
