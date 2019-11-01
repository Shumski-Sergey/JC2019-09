package stitov.Lesson2.Lesson9_Collections.TaskB1;

class PairForFreqDictionary {
    private String word;
    private int amount;
    private String getWord(){
        return this.word;
    }
    private int getAmount(){
        return this.amount;
    }
    PairForFreqDictionary(String word, int amount){
        this.word = word;
        this.amount = amount;
    }
    void showPair(){
        System.out.println(this.getWord() + " appeared "+this.getAmount()+" times");
    }
}
