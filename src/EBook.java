import java.util.Date;
import java.util.Objects;

public class EBook extends Medium{
    private String ISBN;
    private int seitenanzhal;
    private String auflage;

    public EBook(String titel, Urheber urheber, Genre genre, String kommentar, Date erscheinungsdatum, String ISBN, int seitenanzhal, String auflage) {
        super(titel, urheber, genre, kommentar, erscheinungsdatum);
        this.ISBN = ISBN;
        this.seitenanzhal = seitenanzhal;
        this.auflage = auflage;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        Objects.requireNonNull(ISBN);
        this.ISBN = ISBN;
    }

    public int getSeitenanzhal() {
        return seitenanzhal;
    }

    public void setSeitenanzhal(int seitenanzhal) {
        this.seitenanzhal = seitenanzhal;
    }

    public String getAuflage() {
        return auflage;
    }

    public void setAuflage(String auflage) {
        Objects.requireNonNull(auflage);
        this.auflage = auflage;
    }
}
