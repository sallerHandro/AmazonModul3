import java.util.ArrayList;
import java.util.Objects;

public class Medienbibliothek {
    private ArrayList<Medium> medien;

    public Medienbibliothek(ArrayList<Medium> medien){
        this.medien = medien;
    }

    public void mediumHinzufuegen(Medium medium){
        Objects.requireNonNull(medium);
        this.medien.add(medium);
    }

    public void alleAnzeigen(){
        for (Medium medium : medien){
            medium.anzeigen();
        }
    }


}
