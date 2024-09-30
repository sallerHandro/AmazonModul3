import java.util.Date;
import java.util.Objects;

public class Medium {
    private String titel;
    private Urheber urheber;
    private Genre genre;
    private String kommentar;
    private Date erscheinungsdatum;

    public Medium(String titel, Urheber urheber, Genre genre, String kommentar, Date erscheinungsdatum) {
        setTitel(titel);
        setUrheber(urheber);
        setGenre(genre);
        setKommentar(kommentar);
        setErscheinungsdatum(erscheinungsdatum);
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        Objects.requireNonNull(titel);
        this.titel = titel;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        Objects.requireNonNull(urheber);
        this.urheber = urheber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        Objects.requireNonNull(genre);
        this.genre = genre;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        Objects.requireNonNull(kommentar);
        this.kommentar = kommentar;
    }

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        Objects.requireNonNull(erscheinungsdatum);
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public void anzeigen(){
        System.out.println("Titel: " + this.titel);
        System.out.println("Urheber: " + this.urheber);
        System.out.println("Genre: " + this.genre);
        System.out.println("Kommentar: " + kommentar);
        System.out.println("Erscheinungsdatum: " + this.erscheinungsdatum);
    }
}
