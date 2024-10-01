import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Film extends Medium{

    private int spielzeit;
    private String aufloesung;

    public Film(String titel, Urheber urheber, Genre genre, String kommentar, LocalDate erscheinungsdatum, int spielzeit, String aufloesung) {
        super(titel, urheber, genre, kommentar, erscheinungsdatum);
        setSpielzeit(spielzeit);
        setAufloesung(aufloesung);
    }

    public int getSpielzeit() {
        return spielzeit;
    }

    public void setSpielzeit(int spielzeit) {
        this.spielzeit = spielzeit;
    }

    public String getAufloesung() {
        return aufloesung;
    }

    public void setAufloesung(String aufloesung) {
        Objects.requireNonNull(aufloesung);
        this.aufloesung = aufloesung;
    }

    @Override
    public void anzeigen(){
        super.anzeigen();
        System.out.println("Spielzeit: " + this.spielzeit);
        System.out.println("Auflösung: " + this.aufloesung);
    }
}
