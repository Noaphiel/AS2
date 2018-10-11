import java.time.LocalDate;
import java.util.ArrayList;

public class Bestellung {

    private Kunde kunde;
    private LocalDate datum;
    private ArrayList<Bestellposition> positionen;

    public Bestellung(Kunde k) {
        this.kunde = k;
        this.datum = LocalDate.now();
        positionen = new ArrayList<Bestellposition>();
    }

    public boolean hinzufuegenPosition(Bestellposition p) {
        positionen.add(p);
        // TODO Falls schon vorhanden, nur anzahl erhöhen
        return true;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public ArrayList<Bestellposition> getPositionen() {
        return positionen;
    }

    public boolean entfernenPosition(Bestellposition p) {
        if (positionen.contains(p)) {
            positionen.remove(p);
            return true;
        } else
            return false;

    }

}
