package AlexandraShokhan.lesson14.Taskb2;

import static AlexandraShokhan.lesson14.Taskb2.CarParking.parkAllCars;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int NUM_OF_CARS = 10;
        CarParking carParking = new CarParking(3);
        parkAllCars(NUM_OF_CARS);
    }
}
