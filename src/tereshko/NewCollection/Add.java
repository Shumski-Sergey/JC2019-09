package tereshko.NewCollection;

import java.util.List;

public class Add extends Time implements Measure {
    
    @Override
        public void measureTime(List<Integer> list) {
            setStart();
            addList(list);
            setEnd();
            System.out.println("Время, которое потратил "+list.toString()+": "+(getEnd()-getStart()));
        }

}