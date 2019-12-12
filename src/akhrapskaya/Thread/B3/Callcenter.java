package akhrapskaya.Thread.B3;

class Callcenter {
    private int operatorNumber;


    Callcenter(int operatorNumber) {
        this.operatorNumber = operatorNumber;
    }

    synchronized boolean newCall(Call call) throws InterruptedException {
        System.out.println(call.getName() + ": " + call.getCallTime());
        if (operatorNumber == 0){
            System.out.println( "Все операторы заняты. Дождитесь ответа оператора.");
            wait(call.getWaitTime()*1000);
        }
        if (operatorNumber == 0){
            System.out.println( call.getName() + ": Жду уже " + call.getWaitTime() + " - очень долго. Я вешаю трубку. ");
            return false;
        }
        else {
            operatorNumber--;
            System.out.println( call.getName() + ",готов вам помочь.");
            return true;
        }
    }
    synchronized void endCall(Call call){
        operatorNumber++;
        System.out.println( call.getName() + ": Спасибо, досвидания! ");
        notify();
    }

}
