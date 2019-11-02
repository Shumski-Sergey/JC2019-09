package tereshko.NewCollection;

import java.util.List;

import static tereshko.NewCollection.Numbs.TENTHOUSAND;
import static tereshko.NewCollection.MyRandom.randomTenThousand;


public class Get extends Times implements Measure {
    /** Метод измеряет время, при котором выбирает элемент из списка
     * @author Rtreresh;
     */
    @Override

    public void measureTime(List<Integer> list) {
        addList(list);
        setStart();
        for (int i = 0; i < TENTHOUSAND; i++) {
            list.get(randomTenThousand());
        }
        setEnd();
        System.out.println("Время,которое потратил " + list.getClass().getSimpleName() + " toGet: " + (getEnd() - getStart()) + "мс");
    }
}

