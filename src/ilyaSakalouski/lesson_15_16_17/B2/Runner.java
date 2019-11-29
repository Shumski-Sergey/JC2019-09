package ilyaSakalouski.lesson_15_16_17.B2;

import java.util.ArrayList;

public class Runner {
    private static final int PARKING_PLACES = 3;
    private static final int ONE_THOUSAND = 1000;

    public static void main(String[] args) throws InterruptedException{
        ArrayList<Car> cars = getListOfCars();
        Parking parking = new Parking(PARKING_PLACES);

        Thread[] parkingCars = new Thread[cars.size()];
        for (int i = 0; i < cars.size(); i++)
            parkingCars[i] = new Thread(new CarPark(cars.get(i), parking));

        for (Thread t: parkingCars){
            t.start();
            Thread.sleep(ONE_THOUSAND);
        }
        for (Thread t: parkingCars){
            t.join();
        }
    }

    private static ArrayList<Car> getListOfCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("(1)FIRST", 15));
        cars.add(new Car("(2)SECOND", 12));
        cars.add(new Car("(3)THIRD", 3));
        cars.add(new Car("(4)FOURTH", 10));
        cars.add(new Car("(5)FIFTH", 6));
        return cars;
    }
}
