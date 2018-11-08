/**
 * Klasse Nutzer
 *
 * @author Sven Grothe
 *
 */
public class Nutzer {

    private String name;
    private int nummer;
    private int gebuerenKontostand;
    private int anzahlBuecher;
    private boolean gesperrt;
    private static int letzteNummer = 1;

    // Default Konstruktor
    public Nutzer() {
        this.nummer = letzteNummer;
        this.anzahlBuecher = 0;
        this.gebuerenKontostand = 0;
        incrementLetzteNummer();
        entsperren();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return nummer;
    }

    public void incrementLetzteNummer() {
        Nutzer.letzteNummer++;
    }

    public int getGebuerenKontostand() {
        return gebuerenKontostand;
    }

    public void setGebuerenKontostand(int gebuerenKontostand) {
        this.gebuerenKontostand = gebuerenKontostand;
    }

    public int getAnzahlBuecher() {
        return anzahlBuecher;
    }

    public void setAnzahlBuecher(int anzahlBuecher) {
        this.anzahlBuecher = anzahlBuecher;
    }

    public boolean isGesperrt() {
        return gesperrt;
    }

    public void sperren() {
        this.gesperrt = true;
    }

    public void entsperren() {
        this.gesperrt = false;
    }
}
