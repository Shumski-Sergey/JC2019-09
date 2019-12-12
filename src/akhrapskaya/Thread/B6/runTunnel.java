package akhrapskaya.Thread.B6;


public class runTunnel implements Runnable {


     private Train train;
     private static Tunnel tunnel= new Tunnel();

    runTunnel(Train train) {
        this.train = train;
    }

    @Override
    public void run() {
        tunnel.intoTunnel(train);

    }
}
