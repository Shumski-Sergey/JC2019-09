package balexej.test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mix {
   public static void main(String[] args){
       Map<String,Integer> map = new HashMap<String, Integer>();
       map.put("key", 1);
       map.put("key1", 2);
       map.put("key3", 5);
       Integer g = map.get("key3");
       System.out.println(g);
       map.remove("key");

       Set<String> strings = map.keySet();
       for (String k : strings){
           System.out.println(k);
       }
       for (Integer a : map.values()){
           System.out.println(a);
       }

       System.out.println(map.size());


   }
}
