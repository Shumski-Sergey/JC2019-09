package aflyer.Methods;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class SetMethod {
    private HashSet Hset;
    
    public static void setOutput(HashSet Hset){
        Iterator iterator = Hset.iterator();
        while (iterator.hasNext()) {
            System.out.print(" "+ iterator.next());
        }
    }
    public static void HashMapOutput( HashMap <Object, Integer> mapa ){
        for (Map.Entry <Object, Integer> item : mapa.entrySet())
            System.out.println(item.getKey() + " - " + item.getValue());
    }

}
