package nbogdan.Lesson6.Task2;

class Atm {
    private int nomination20 = 0, nomination50 = 0, nomination100 = 0;
    private static final int NUM20 = 20, NUM50 = 50, NUM100 = 100;
    private String bankName;
    Atm(String bankName) {
        this.bankName = bankName;
    }
    Atm(String bankName, int nomination20, int nomination50, int nomination100) {
        this.bankName = bankName;
        this.nomination20 = nomination20;
        this.nomination50 = nomination50;
        this.nomination100 = nomination100;
    }
    void addNomination(int nomination20, int nomination50, int nomination100) {
        this.nomination20 += nomination20;
        this.nomination50 += nomination50;
        this.nomination100 += nomination100;
    }
    private boolean check(int sum) {
        if ((sum % 10 == 0 && sum > NUM50) || (sum % NUM20 == 0 && sum > 0)) {
            return (((this.nomination100 * NUM100) + (this.nomination50 * NUM50) + (this.nomination20 * NUM20)) >= sum);
        } else return false;
    }
    int[] sraniiKalculator(Atm atm, int sum) {
        int[] bill = new int[]{0, 0, 0};
        if (sum == 0 || sum > (atm.nomination20 * NUM20 + atm.nomination50 * NUM50 + atm.nomination100 * NUM100)) return bill;
        if ((sum % 10 == 0 && sum > NUM50) || (sum % NUM20 == 0 && sum > 0)) {
            while (sum > 0 && sum % NUM50 != 0) {
                bill[0]++;
                sum -= NUM20;
            }
            if (bill[0] > atm.nomination20) {
                bill[0] = 0;
                return bill;
            }
            if (sum == 0) return bill;
            bill[2] = sum / 100;
            if (sum % 100 == NUM50) bill[1]++;
            if ((bill[2] <= atm.nomination100) && (bill[1] <= atm.nomination50)) return bill;
            while (!(bill[2] <= atm.nomination100 && (bill[1] <= atm.nomination50))) {
                bill[2]--;
                bill[1] += 2;
            }
        } else return bill;
        return bill;
    }
}