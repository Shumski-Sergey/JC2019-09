package AlexandraShokhan.lesson14.Taskb2;

import static AlexandraShokhan.lesson14.Taskb2.CarParking.*;

public class Car implements Runnable {

    int carID;

    int carPlace;

    public Car(int carID) {
        this.carID = carID;
    }

    public int getCarID() {
        return carID;
    }

    public int getCarPlace() {
        return this.carPlace;
    }

    public void setCarPlace(int carPlace) {
        this.carPlace = carPlace;
    }

    public void run() {
        System.out.println("Car " + getCarID() + " wants to park at the parking place.");
        try {
            semaphore.acquire();
            setCarPlace(-1);
            synchronized (CAPACITY) {
                for (int i = 0; i < getCapacity(); i++)
                    if (!CAPACITY[i]) {
                        CAPACITY[i] = true;
                        setCarPlace(i);
                        System.out.println("Car " + getCarID() + " has parked at the parking place # " + i);
                        break;
                    }
                }
            Thread.sleep(5000);

            synchronized (CAPACITY) {
                CAPACITY[getCarPlace()] = false;
                setCarPlace(-1);
            }
            semaphore.release();
            System.out.println("Car " + getCarID() + " has left the parking place.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}