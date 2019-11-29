package ilyaSakalouski.lesson_15_16_17.B2;

class Parking {
    private int places;
    private static final int WAITING_TIME = 5000;

    Parking(int places) {
        this.places = places;
    }

    synchronized boolean getPlace(Car car) throws InterruptedException {
        if (places == 0) {
            System.out.println(car.getNumber() + ": Parking places are busy. I'm wait...");
            this.wait(WAITING_TIME);
        }
        if (places == 0) {
            System.out.println(car.getNumber() + ": I can't wait more.... I'm leave.");
            return false;
        } else {
            places--;
            System.out.println(car.getNumber() + ": I'm parking on " + car.getParkingTime() + " sec.");
            return true;
        }
    }

    synchronized void carLeave(Car car) {
        System.out.println(car.getNumber() + ": I'm leave.");
        places++;
        this.notify();
    }
}
