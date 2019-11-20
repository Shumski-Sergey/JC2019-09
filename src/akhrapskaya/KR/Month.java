package akhrapskaya.KR;

class Month {
    private final static String[] monthOfYear = {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };
    private int i;

    Month(int i){
        this.i = i;
    }
    String getMonth(){
        return monthOfYear[i-1];
    }
}
