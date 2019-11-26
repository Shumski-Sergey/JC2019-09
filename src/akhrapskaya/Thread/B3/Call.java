package akhrapskaya.Thread.B3;

public class Call {
    private String name;
    private int WAIT_TIME;
    private int CALL_TIME;

    Call(String name, int WAIT_TIME, int CALL_TIME) {
        this.name = name;
        this.WAIT_TIME = WAIT_TIME;
        this.CALL_TIME = CALL_TIME;
    }

    public String getName() {
        return name;
    }

    int getWaitTime() {
        return WAIT_TIME;
    }

    int getCallTime() {
        return CALL_TIME;
    }
}
