package akhrapskaya.Thread.B2;

public class ParkCar implements Runnable {
    private Parking parking;
    private Car car;

    ParkCar(Car car, Parking parking){
        this.parking = parking;
        this.car = car;
    }

    @Override
    public void run() {
        try {
            if(parking.getPlace(car)) {
                Thread.sleep(car.getParkingTime() * 1000);
                parking.carLeave(car);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
