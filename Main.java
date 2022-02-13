// package ru.netology;

public class Main {

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatre()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Триггер", 2016, 18),
                new Movie("Один дома", 1990, 6),
                new Movie("Король Лев", 2019, 12),
                new Movie("Адмирал", 2017, 18)
        };
    }

    public static Theatre[] getTheatre() {
        return new Theatre[]{
                new Theatre("АннаКаренина", 2017, 16),
                new Theatre("Ревизор", 2009, 12),
                new Theatre("Отцы и дети", 2001, 18),
                new Theatre("Буратино", 2012, 6)
        };
    }

    public static void validEvent(Event event) throws RuntimeException {
        for (Event movies : getMovies()) {
            if (movies.getTitle() == null || movies.getReleaseYear() == 0 || movies.getAge() == 0) {
                throw new RuntimeException();
            }
        }
        for (Event theatres : getTheatre()) {
            if (theatres.getTitle() == null || theatres.getReleaseYear() == 0 || theatres.getAge() == 0) {
                throw new RuntimeException();
            }
        }

    }
}

