import java.time.LocalDate;

public class Buchexemplar {

    private int nummer;
    private Leser verliehenAn;
    LocalDate rueckgabeDatum;
    private static int letzteNummer = 0;

    public Buchexemplar() {
        inkrementiereLetzteNummer();
        this.nummer = getLetzteNummer();
        setVerliehenAn(null);
    }

    public LocalDate getRueckgabeDatum() {
        return rueckgabeDatum;
    }

    public void setRueckgabeDatum(LocalDate rueckgabeDatum) {
        this.rueckgabeDatum = rueckgabeDatum;
    }

    public int getNummer() {
        return this.nummer;
    }

    public static int getLetzteNummer() {
        return letzteNummer;
    }

    private static void inkrementiereLetzteNummer() {
        letzteNummer++;
    }

    public void setVerliehenAn(Leser leser) {
        this.verliehenAn = leser;
    }

    public Leser getVerliehenAn() {
        if (istVerliehen())
            return verliehenAn;
        return null;
    }

    public boolean istVerliehen() {
        if (this.verliehenAn != null)
            return false;
        return true;
    }

    public void ausleihen(Leser leser) {
        setVerliehenAn(leser);
        setRueckgabeDatum(LocalDate.now().plusWeeks(4));
        leser.getAusgeliehen().add(this);
    }

    public int zurückgeben() {
        int verzug = 0;
        while (LocalDate.now().isAfter(rueckgabeDatum)) {
            rueckgabeDatum.plusWeeks(1);
            verzug++;
        }
        getVerliehenAn().getAusgeliehen().remove(this);
        setVerliehenAn(null);
        return verzug;
    }
}
