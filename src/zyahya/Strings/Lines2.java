package zyahya.Strings;
//count the  number of letters with spaces

public class Lines2 {
    public static void main(String[] args) {
        String  abc= "I need HELP.  ";
        int count=0;
        for(int i=0; i< abc.length(); i++){
            count++;
        }
        System.out.println("The num of char is: " +count);
    }
}
