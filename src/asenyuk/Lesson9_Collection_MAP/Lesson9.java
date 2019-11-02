package asenyuk.Lesson9_Collection_MAP;

public class Lesson9 {

    public static void main (String [] args){

        String line="123 321 567 213 789";
String [] words=line.split(" ");

for (String word: words) {
    //  System.out.println(word);
    String[] ArrSymbol = word.split("");
    for (String symbol : ArrSymbol) {
        System.out.println(symbol);
        System.out.println("--------");
        for(String  slovo:  words){
            slovo.contains(symbol);
        }
    }
//
}


    }
}
