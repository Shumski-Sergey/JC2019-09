package AlexandraShokhan.lesson14.Taskb2;

import java.util.concurrent.Semaphore;

public class CarParking {

    public final static Semaphore semaphore = new Semaphore(3, true);
    public static boolean[] CAPACITY = new boolean[3];
    static int capacity = 3;

    public CarParking(int capacity) {
        this.capacity = capacity;
    }

    public static int getCapacity() {
        return CarParking.capacity;
    }

    static void parkAllCars(int numberOfCars) throws InterruptedException {
        for (int i = 0; i < numberOfCars; i++) {
            Thread th = new Thread(new Car(i));
            th.start();
            Thread.sleep(400);
        }
    }
}
