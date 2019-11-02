package tereshko.Collection;


import java.util.List;

import static tereshko.Collection.Numbs.ONEMILLION;

  class Times {
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

     long getStart() {
        return this.start;
    }

    long getEnd() {
        return end;
    }

    void setEnd() {
        this.end = System.currentTimeMillis();
    }
}
