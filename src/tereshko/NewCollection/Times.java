package tereshko.NewCollection;


import java.util.List;

import static tereshko.NewCollection.Numbs.ONEMILLION;

public  class Times {
    private long start;
    private long end;
    void addList(List<Integer> list){
        for (int i = 0; i <ONEMILLION; i++) {
            list.add(i);
        }
    }

    void setStart() {
        this.start = System.currentTimeMillis();
    }

    public long getStart() {
        return this.start;
    }

    long getEnd() {
        return end;
    }

    void setEnd() {
        this.end = System.currentTimeMillis();
    }
}
