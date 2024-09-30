import java.util.Date;

public class Medium {
    private String titel;
    private Urheber urheber;
    private Genre genre;
    private String kommentar;
    private Date erscheinungsdatum;

    public Medium(String titel, Urheber urheber, Genre genre, String kommentar, Date erscheinungsdatum) {
        this.titel = titel;
        this.urheber = urheber;
        this.genre = genre;
        this.kommentar = kommentar;
        this.erscheinungsdatum = erscheinungsdatum;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Urheber getUrheber() {
        return urheber;
    }

    public void setUrheber(Urheber urheber) {
        this.urheber = urheber;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getKommentar() {
        return kommentar;
    }

    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    public Date getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public void setErscheinungsdatum(Date erscheinungsdatum) {
        this.erscheinungsdatum = erscheinungsdatum;
    }
}
