package nbogdan.Lesson15Thread.TaskA1;

public class Book {
    private String name;
    private int id;
    private boolean availability;
    Book(String name, int id) {
        this.name = name;
        this.id = id;
        this.availability = true;
    }
    public String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    void setAvailability(boolean availability) {
        this.availability = availability;
    }

    boolean isAvailability() {
        return availability;
    }
}
