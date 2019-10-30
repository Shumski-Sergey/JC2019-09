package aflyer.les9_Collections;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.regex.Pattern;

//Имеется текст. Следует составить для него частотный словарь
public class TaskB1 {

    public static void main(String[] args) throws IOException {
        String filename = "src\\aflyer\\les9_Collections\\Input.txt";
        String filetext = Files.lines(Paths.get(filename)).reduce("",String::concat);
        Pattern pattern = Pattern.compile("\\W+");
        String[] text = pattern.split(filetext);
        HashMap<String,Integer> mapa=new HashMap<>();
        for(String word: text){
            int count=1;
            if (!mapa.containsKey(word)){
                mapa.put(word, count);
            } else {
                count += mapa.get(word);
                mapa.replace(word,count);
            }

        }
        for (HashMap.Entry<String, Integer> item: mapa.entrySet()) {
            System.out.println(item.getKey() +" повторяется "+ item.getValue()+" раз");

        }


    }
}
