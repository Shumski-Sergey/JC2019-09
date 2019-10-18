package akhrapskaya.Lesson6;

public class Money {
    private long r;
    private char kop;
    private Money(long r, int kop){
        this.r = r;
        this.kop = (char) kop;
    }
    private void out(){
        System.out.println(r + "," + (int) kop);
    }
    private long getR(){
        return r;
    }
    private int getKop(){
        return kop;
    }
    private Money add(Money m) {
        long r1 = r + m.getR();
        int kop1 = kop + m.getKop();
        if (kop1 >= 100) {
            r1++;
            kop1 -= 100;
        }
        return new Money(r1, (char) kop1);
    }
    private Money minus(Money m){
        if(this.compare(m) == -1)
            return new Money(-1,0);
        long r1 = r - m.getR();
        int kop1;
        if (kop < m.getKop()) {
            r1--;
            kop1 =100+kop-m.getKop();
        }
        else
            kop1 =kop - m.getKop();
        return new Money(r1, (char) kop1);
    }
    private int compare(Money m){
        int k = 0;
        if (r != m.getR()){
            k= r > m.getR()? 1: -1;
        }
        else{
             if( kop > m.getKop())
                k = 1;
             if( kop < m.getKop())
                k = -1;
        }
        return k;
    }

    public static void  main(String[] args){
        Money m = new Money(5, 60);
        m.out();
        Money n = new Money(5, 50);
        Money k = m.add(n);
        k.out();
        System.out.println(m.compare(n));
        System.out.println(n.compare(m));
        k = m.minus(n);
        k.out();
        k = n.minus(m);
        k.out();

    }
}
