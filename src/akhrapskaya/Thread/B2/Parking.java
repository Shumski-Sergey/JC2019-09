package akhrapskaya.Thread.B2;


class Parking {
    private int placesNumber;
    private static final int WAIT_TIME =  5000;

    Parking(int placesNumber){
        this.placesNumber = placesNumber;
    }

    synchronized boolean getPlace(Car car) throws InterruptedException {
        if (placesNumber == 0) {
            System.out.println( Thread.currentThread().getName() + " " + car.getName() + ": На парковке нет мест, я жду");
            this.wait(WAIT_TIME);
        }
        if (placesNumber == 0){
            System.out.println( Thread.currentThread().getName() + " " + car.getName() + ": Не могу больше ждать. Уезжаю!");
            return false;
        }
        else {
            placesNumber--;
            System.out.println( Thread.currentThread().getName() + " " + car.getName() + ": Припарковался на " + car.getParkingTime() +" секунд.");
            return true;
        }
    }
    synchronized void carLeave(Car car){
        System.out.println( Thread.currentThread().getName() + " " + car.getName() +": Я уехал.");
        placesNumber++;
        this.notify();
    }
}
