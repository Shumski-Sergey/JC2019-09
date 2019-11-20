package balexej.No.Movie;

public class MovieTestDrive {
    public static void main(String[] args){
    Movie one = new Movie();
    one.title = "Как прогореть на Акциях";
    one.genre = "Трагедия";
    one.rating = -2;

    Movie two = new Movie();
    two.title = "Потерянный в офисе";
    two.genre = "Комедия";
    two.rating = 5;
    two.playIt();
    }
}

