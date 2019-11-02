package tereshko.NewCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Test5  {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> link = new LinkedList<>();
        Get list1 = new Get(),linkliste1 = new Get();
        Add list2 = new Add(),linklist2 = new Add();;
        equalsGetLists(list1,linkliste1,array,link);
        equalsAddLists(list2,linklist2,array,link);

    }
    private static void equalsAddLists(Add a,Add b ,List<Integer> array, List<Integer> link){
        a.measureTime(array);
        b.measureTime(link);
    }
    private static  void  equalsGetLists(Get a,Get b,List<Integer> array, List<Integer> link){
        a.measureTime(array);
        b.measureTime(link);
    }
}
