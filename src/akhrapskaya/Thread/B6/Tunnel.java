package akhrapskaya.Thread.B6;

import java.util.concurrent.Semaphore;

class Tunnel{

    private Semaphore semaphore1 = new Semaphore(2);
    private Semaphore semaphore2 = new Semaphore(2);

     void intoTunnel(Train train){
        try {
            if (train.getRout() == Rout.AB){
                semaphore1.acquire();
                train.intoTunnel();
                Thread.sleep(5000);
                train.fromTunnel();
                semaphore1.release();
            }

            else{
                semaphore2.acquire();
                train.intoTunnel();
                Thread.sleep(5000);
                train.fromTunnel();
                semaphore2.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
