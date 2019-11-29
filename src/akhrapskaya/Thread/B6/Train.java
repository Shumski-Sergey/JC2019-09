package akhrapskaya.Thread.B6;

class Train {

    private int trainNumber;
    private Rout rout;

    Train(int trainNumber, Rout rout) {
        this.trainNumber = trainNumber;
        this.rout = rout;
    }
    Rout getRout() {
        return rout;
    }

    void intoTunnel(){
        System.out.println("Поезд №" + trainNumber + "заехал в тоннель в направлении:" + rout + ".");
    }
    void fromTunnel(){
        System.out.println("Поезд №" + trainNumber + "выехал из тоннеля.");
    }

}
enum Rout{
    AB,
    BA
}