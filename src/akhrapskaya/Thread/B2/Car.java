package akhrapskaya.Thread.B2;

public class Car {

    private String name;
    private int parkingTime;

    Car(String name, int parkingTime){
        this.name = name;
        this.parkingTime = parkingTime;
    }

    public String getName() {
        return name;
    }

    int getParkingTime() {
        return parkingTime;
    }

}
