package stitov.Lesson2.Lesson6.Card;

public class BasicCard {
    private String holder;
    private int expMonth;
    private int expYear;
    private int cvvCode;
    private String number;
    public BasicCard(String holder, int expMonth, int expYear, int cvvCode, String number){
        this.holder =holder;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvvCode = cvvCode;
        this.number = number;
    }
    public String getHolder(){return  this.holder;}
    public int getExpMonth(){ return this.expMonth;}
    public int getExpYear(){return this.expYear;}
    public int getCvvCode(){return this.cvvCode;}
    public String getNumber() { return this.number; }
    protected void setCvvCode(int cvvCode) {this.cvvCode = cvvCode;}
    protected void setExpMonth(int expMonth) { this.expMonth = expMonth; }
    protected void setExpYear(int expYear) { this.expYear = expYear; }
    protected void setHolder(String holder) { this.holder = holder; }
    protected void setNumber(String number) { this.number = number; }
}

