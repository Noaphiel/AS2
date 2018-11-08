import java.time.LocalDate;

/**
 * Klasse Buch
 *
 * @author Sven Grothe
 *
 */
public class Buch1 {

    private String autor;
    private String titel;
    private int nummer;
    private int leihdauer;
    private LocalDate rueckgabeDatum;
    private Nutzer ausgeliehenAn;
    private Nutzer vorbestelltVon;
    private static int letzteNummer = 1;

    // Default Konstruktur
    public Buch1() {
        this.nummer = letzteNummer;
        incrementLetzteNummer();
        ausgeliehenAn = null;
    }

    // Getters and Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getNummer() {
        return nummer;
    }

    public void incrementLetzteNummer() {
        Buch1.letzteNummer++;
    }

    public int getLeihdauer() {
        return leihdauer;
    }

    // setzt bei ungültiger Parameterübergabe auf den Standardwert von 4 Wochen
    public void setLeihdauer(int leihdauer) {
        if (leihdauer == 2)
            this.leihdauer = leihdauer;
        else
            this.leihdauer = 4;
    }

    public LocalDate getRueckgabeDatum() {
        return rueckgabeDatum;
    }

    private void setRueckgabeDatum(LocalDate rueckgabeDatum) {
        this.rueckgabeDatum = rueckgabeDatum;
    }

    public Nutzer getAusgeliehenAn() {
        return ausgeliehenAn;
    }

    public void setAusgeliehenAn(Nutzer ausgeliehenAn) {
        this.ausgeliehenAn = ausgeliehenAn;
    }

    public Nutzer getVorbestelltVon() {
        return vorbestelltVon;
    }

    public void setVorbestelltVon(Nutzer vorbestelltVon) {
        this.vorbestelltVon = vorbestelltVon;
    }

    public void ausleihen(Nutzer n) {
        if (this.getAusgeliehenAn() == null && n.isGesperrt() == false) {
            n.setAnzahlBuecher(n.getAnzahlBuecher() + 1);
            this.setAusgeliehenAn(n);
            this.setRueckgabeDatum(LocalDate.now().plusWeeks(this.leihdauer));
        } else
            System.err.println("Buch bereits ausgeliehen");
    }

    public void rueckgabe(Nutzer n) {
        if (this.getAusgeliehenAn() != null) {
            getAusgeliehenAn().setAnzahlBuecher(getAusgeliehenAn().getAnzahlBuecher() - 1);
            this.setAusgeliehenAn(null);
            if (LocalDate.now().isAfter(this.getRueckgabeDatum())) {
                // TODO Gebührenberechnung (benötigt Ausleihbedingungen)
                // TODO Gebühr von n.gebuehrenKontostand abziehen
                // TODO Konto sperren, wenn Gebühr nicht bezahlt werden kann
            }
        }
    }

    public void vorbestellen(Nutzer n) {
        if (this.getVorbestelltVon() != null && n.isGesperrt() == false) {
            this.setVorbestelltVon(n);
        } else {
            System.err.println("Buch bereits vorbestellt");
        }
    }
}