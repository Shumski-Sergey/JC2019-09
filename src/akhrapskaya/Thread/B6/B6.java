package akhrapskaya.Thread.B6;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class B6 {
    private static final int TRAIN_NUMBER = 10;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Train> trains = setTrains();
        ExecutorService es = Executors.newFixedThreadPool(TRAIN_NUMBER);
        for (Train train: trains) {
            es.submit(new runTunnel(train));
        }
        es.shutdown();
        es.awaitTermination(1, TimeUnit.DAYS);
    }

    private static ArrayList<Train> setTrains(){
        Random random = new Random();
        ArrayList<Train> trains = new ArrayList<>();
        for (int i = 0; i< TRAIN_NUMBER; i++){
            trains.add(new Train(i+1, Rout.values()[random.nextInt(2)]));
        }
        return trains;
    }
}
