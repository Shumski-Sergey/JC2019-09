package akhrapskaya.Thread.B2;

import java.util.ArrayList;

public class B2 {
    private static final int PARKING_PLACES = 3;

    public static void main(String[] args) throws InterruptedException{
        ArrayList<Car> cars = getListOfCars();
        Parking parking = new Parking(PARKING_PLACES);

        Thread[] parkingCars = new Thread[cars.size()];
        for (int i = 0; i < cars.size(); i++)
            parkingCars[i] = new Thread(new ParkCar(cars.get(i), parking));

        for (Thread t: parkingCars){
            t.start();
            Thread.sleep(1000);
        }
        for (Thread t: parkingCars){
                t.join();
        }
    }

    private static ArrayList<Car> getListOfCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Acura", 10));
        cars.add(new Car("Alfa Romeo", 10));
        cars.add(new Car("Aston Martin", 5));
        cars.add(new Car("Bentley", 10));
        cars.add(new Car("BMW", 5));
        cars.add(new Car("Bugatti", 10));
        cars.add(new Car("Audi", 5));
        return cars;
    }
}
