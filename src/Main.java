import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate datum = LocalDate.of(2007,12,20);
        Urheber urheber = new Urheber("Raphli", "Walter", "Walter GmbH");
        Genre genre = new Genre("Action");
        Medium f1 = new Film("Cool", urheber, genre, "Cool", datum, 123, "HD");
        f1.anzeigen();

    }
}