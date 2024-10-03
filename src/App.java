import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        LocalDate datum = LocalDate.of(2007,12,20);
        Urheber urheber = new Urheber("Raphli", "Walter", "Walter GmbH");
        Genre genre = new Genre("Action");
        Medium f1 = new Film("Cool", urheber, genre, "Cool", datum, 123, "HD");
        Medium eb1 = new EBook("EBook", urheber, genre, "cool", datum, "9324092384239048", 193, "cool");
        Medienbibliothek medienbibliothek = new Medienbibliothek(new ArrayList<>());
        medienbibliothek.mediumHinzufuegen(f1);
        medienbibliothek.mediumHinzufuegen(eb1);
        medienbibliothek.alleAnzeigen();

    }
}