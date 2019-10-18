package stitov.Lesson2.Lesson6.CashMachine;

public class CashMachine {
    private int twenties;
    private int fifties;
    private int hundreds;
    private static final int TWENTY = 20;
    private static final int FIFTY = 50;
    private static final int HUNDRED = 100;
    public CashMachine(){
        this.twenties = 0;
        this.fifties = 0;
        this.hundreds = 0;
    }
    public CashMachine(int tw, int fif, int hund) {
        this.twenties = tw;
        this.fifties = fif;
        this.hundreds = hund;
    }
    public int getTwenties(){ return this.twenties; }
    public int getFifties() {return this.fifties;}
    public int getHundreds() {return this.hundreds;}
    public void setTwenties(int tw){this.twenties = tw;}
    public void setFifties (int fif){this.fifties = fif;}
    public void setHundreds(int hund){this.hundreds = hund;}
    public long getAllMoney() { return this.twenties*TWENTY+this.fifties*FIFTY+this.hundreds*HUNDRED;}

    public void showAllMoney() {
        System.out.println("In this cashmachine " + (this.twenties*TWENTY+this.fifties*FIFTY+this.hundreds*HUNDRED)+"$");
    }
    public void showNotes(){
        System.out.println("In this cashmachine " + this.twenties + " banknotes with denomination " + TWENTY + "$");
        System.out.println("In this cashmachine " + this.fifties + " banknotes with denomination " + FIFTY + "$");
        System.out.println("In this cashmachine " + this.hundreds + " banknotes with denomination " + HUNDRED + "$");
    }
    public void addMoney (int tw, int fif, int hund){
        this.twenties += tw;
        this.fifties +=fif;
        this.hundreds +=hund;
    }
    public boolean withdrawMoney(int money){
        int tw, fif, hund;
        int wmoney = money;
        if ((money%TWENTY!=0)||(money%FIFTY!=0)){
            return false;
        }
        if (money>this.getAllMoney()) {
            return false;
        }
        hund = (wmoney - wmoney%HUNDRED)/HUNDRED;
        if (hund > this.hundreds) {
            hund = this.hundreds;
        }
        wmoney = wmoney - hund*HUNDRED;
        fif = (wmoney - wmoney%FIFTY)/FIFTY;
        if (fif > this.fifties) {
            fif = this.fifties;
        }
        wmoney = wmoney - fif*FIFTY;
        tw = (wmoney - wmoney%TWENTY)/TWENTY;
        wmoney = wmoney - tw*TWENTY;
        if (wmoney != 0){return false;}
        if (tw > this.twenties) {
            return false;
        } else {
            System.out.println("Withdrawed " + hund + " - 100$ and "+fif + " - 50$ and " + tw +" - 20$");
            this.hundreds -= hund;
            this.fifties -= fif;
            this.twenties -=tw;
            return true;
        }


    }

}
