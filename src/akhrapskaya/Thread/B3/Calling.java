package akhrapskaya.Thread.B3;

public class Calling implements Runnable {

    private Call call;
    private Callcenter callcenter;

    Calling(Call call, Callcenter callcenter) {
        this.call = call;
        this.callcenter = callcenter;
    }

    @Override
    public void run() {
        try {
            if(callcenter.newCall(call)){
                Thread.sleep(call.getCallTime()*1000);
                callcenter.endCall(call);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
