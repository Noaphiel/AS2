import java.time.LocalDate;

public class Ausweis {

    private int nummer;
    private LocalDate ablauf_datum;
    private boolean gesperrt;
    private static int letzteNummer = 1000;

    public Ausweis() {
        Ausweis.inkrementiereLetzteNummer();
        this.nummer = Ausweis.getLetzteNummer();
        this.setAblauf_datum(LocalDate.now().plusYears(1));
        this.entsperren();
    }

    public int getNummer() {
        return nummer;
    }

    public LocalDate getAblauf_datum() {
        return ablauf_datum;
    }

    public void setAblauf_datum(LocalDate ablauf_datum) {
        this.ablauf_datum = ablauf_datum;
    }

    public void sperren() {
        this.gesperrt = true;
    }

    public void entsperren() {
        this.gesperrt = false;
    }

    public boolean istGesperrt() {
        return gesperrt;
    }

    private static int getLetzteNummer() {
        return letzteNummer;
    }

    private static void inkrementiereLetzteNummer() {
        letzteNummer++;
    }
}