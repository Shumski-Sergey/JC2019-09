package aflyer.Methods;

import java.util.*;

public class SetMethod {
    private HashSet Hset;

    public static void setOutput ( HashSet Hset ) {
        Iterator iterator = Hset.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }

//    public static void HashMapOutput ( HashMap mapa ) {
//        for (Map.Entry item : mapa.entrySet())
//            System.out.println(item.getKey() + " - " + item.getValue());
//    }

    public static void HashMapIntIntOutput ( HashMap <Integer, Integer> mapa ) {
        for (Map.Entry <Integer, Integer> item : mapa.entrySet())
            System.out.println(item.getKey() + " - " + item.getValue());
    }
    public static void HashMapStrStrOutput ( HashMap <String, String> mapa ) {
        for (Map.Entry <String, String> item : mapa.entrySet())
            System.out.println(item.getKey() + " - " + item.getValue());
    }
}
