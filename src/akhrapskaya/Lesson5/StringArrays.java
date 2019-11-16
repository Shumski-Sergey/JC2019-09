package akhrapskaya.Lesson5;

import java.util.Scanner;

public class StringArrays {
    private String[] sArray;
    int len;

    protected StringArrays(){
        len = 0;
        sArray = new String[len];
    }
    protected StringArrays(int len){
        this.len = len;
        sArray = new String[len];
    }
     public StringArrays(String s){
        final int MAX_LINE = 20;
        Scanner sc = new Scanner(System.in);
        len = -1;
        while (len < 0 || len > MAX_LINE) {
            System.out.println(s + "(0-" + MAX_LINE + ")");
            len = sc.nextInt();
        }
        sArray = new String[len];
    }
    void set(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        for(int i = 0; i < len; i++){
            sArray[i] = sc.nextLine();
        }
    }
     public void setWords(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        for(int i = 0; i < len; i++){
            sArray[i] = sc.next();
        }
    }
     public String get(int i){
        return sArray[i];
    }
    void putOut(){
        for( String line: sArray){
            System.out.println(line);
        }
    }
    void sort(){
        String s;
        for( int i = 0; i < len-1; i++){
            for(int j = 0; j < len-1-i; j++){
                if (sArray[j].length() > sArray[j+1].length()) {
                    s = sArray[j];
                    sArray[j] = sArray[j + 1];
                    sArray[j + 1] = s;
                }
            }
        }
    }
    void outPutLine(int i){
        System.out.println("(" + sArray[i].length() + ")" + " " + sArray[i]);
    }
     int countSymbol(int i){
        StringBuilder s = new StringBuilder();
        for(int j = 0; j < sArray[i].length(); j++){
            if(s.indexOf(String.valueOf(sArray[i].charAt(j))) == -1){
                s.append(sArray[i].charAt(j));
            }
        }
        return s.length();
    }
    String minSymbol(){
        int min = 0;
        for(int i = 1; i < len; i++){
            if(countSymbol(min) > countSymbol(i)){
                min = i;
            }
        }
        return sArray[min];
    }

    int countWords(int i){
        int count = 0;
        int k1 = 0;
        int k2 = 0;
        for (int j = 0; j < sArray[i].length(); j++) {
            switch (sArray[i].charAt(j)){
                  case 'e': case 'a': case 'o':
                  case 'u': case 'i':
                       k1++;
                       break;
                  default:
                       k2++;
                       break;

            }
        }
        if (k1 == k2)
            count = 1;
        return count;
    }
}