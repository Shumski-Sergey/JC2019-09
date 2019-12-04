package ilyaSakalouski.lesson_15_16_17.B2;

public class CarPark implements Runnable {
    private Car car;
    private Parking parking;
    private final static int ONE_THOUSAND = 1000;

    CarPark(Car car, Parking parking) {
        this.car = car;
        this.parking = parking;
    }

    @Override
    public void run() {
        try {
            if (parking.getPlace(car)) {
                Thread.sleep(car.getParkingTime() * ONE_THOUSAND);
                parking.carLeave(car);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
