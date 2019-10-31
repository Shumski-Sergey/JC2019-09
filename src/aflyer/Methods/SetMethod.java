package aflyer.Methods;

import java.util.HashSet;
import java.util.Iterator;

public class SetMethod {
    private HashSet Hset;
    
    public static void setOutput(HashSet Hset){
        Iterator iterator = Hset.iterator();
        while (iterator.hasNext()) {
            System.out.print(" "+ iterator.next());
        }
    }

}
