package asenyuk.Lesson8_Collection.Task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Task5 {
    public static void main (String [] args) throws IOException {

        FileInputStream stream;
        stream = new FileInputStream("C:\\Users\\Alexsandr\\Downloads\\COLLECTION1.txt");
        int lengt = stream.available();
       // System.out.println(lengt);

        byte [] data=new byte[lengt] ;
        stream.read(data);

        String text=new String(data);

       // System.out.println(text);
        ArrayList <String []>  arrayWords=new ArrayList <>();
      String[] line=  text.split("\n");
for (String i :line) {
   String[] words =i.split(" ");
  arrayWords.add(words);
}
for (String[] word: arrayWords) {
    for (String num : word){
        System.out.println(num);

    }
}
    }
}
