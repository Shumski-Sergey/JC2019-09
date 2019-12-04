package ilyaSakalouski.lesson_15_16_17.B2;

public class Car {
    private String number;
    private int parkingTime;

    Car(String number, int parkingTime) {
        this.number = number;
        this.parkingTime = parkingTime;
    }

    public String getNumber() {
        return number;
    }

    int getParkingTime() {
        return parkingTime;
    }
}
