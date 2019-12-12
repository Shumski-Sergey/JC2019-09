package akhrapskaya.Thread.B3;

import java.util.ArrayList;

public class B3 {
    public static void main(String[] args) throws InterruptedException{
        Callcenter callcenter = new Callcenter(3);
        ArrayList<Call> calls = getListOfCars();

        Thread[] calling = new Thread[calls.size()];
        for (int i = 0; i < calls.size(); i++)
            calling[i] = new Thread(new Calling(calls.get(i), callcenter));

        for (Thread t: calling){
            t.start();
            Thread.sleep(200);
        }
        for (Thread t: calling){
            t.join();
        }
    }

    private static ArrayList<Call> getListOfCars() {
        ArrayList<Call> calls = new ArrayList<>();
        calls.add(new Call("Tom", 2, 5));
        calls.add(new Call("Adam", 3, 10));
        calls.add(new Call("Helen", 5, 6));
        calls.add(new Call("Liza", 1, 3));
        calls.add(new Call("Bob", 3, 4));
        calls.add(new Call("Joe", 10, 5));
        calls.add(new Call("Ann", 1, 5));
        return calls;
    }
}
