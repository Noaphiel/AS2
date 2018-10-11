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
        // Falls p schon in positionen enthalten:
        // Anzahl im schon vorhandenen objekt erhöhen
        for (Bestellposition bp : positionen)

            if (bp.getPosition().equals(p.getPosition())) {
                bp.setAnzahl(bp.getAnzahl() + p.getAnzahl());
                return true;
            }

        positionen.add(p);

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
