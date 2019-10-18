package nsivko.lab6.Task2;

public class Bankomatik {

    private int twenty;
    private int fifty;
    private int hundred;

    Bankomatik(int kup1, int kup2,int kup3) {
        twenty = kup1;
        fifty = kup2;
        hundred = kup3;
    }

    public int kolMoney(int t, int f, int h) {

        int sumM = t * 20 + f * 50 + h * 100;

        return  sumM;
    }

    public int kolT(int kol){

        kol /= 20;

        return kol;
    }
    public int kolF(int kol){

        kol /= 50;

        return kol;
    }

    public static int kolH(int kol) {

        kol /= 100;

        return kol;
    }

}
