package tereshko.NewCollection;

import java.util.List;

public class Add extends Times implements Measure {

    @Override
    public void measureTime(List<Integer> list) {
        setStart();
        addList(list);
        setEnd();
        System.out.println("Время,которое потратил " + list.getClass().getSimpleName() + " toAdd: " + (getEnd() - getStart()) + "мс");

    }
}