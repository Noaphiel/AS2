
public class Bestellposition {

    private Artikel position;
    private int anzahl;

    public Bestellposition(Artikel a, int n) {
        this.position = a;
        this.anzahl = n;
    }

    public Artikel getPosition() {
        return position;
    }

    public void setPosition(Artikel position) {
        this.position = position;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

}
