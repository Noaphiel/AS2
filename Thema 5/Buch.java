import java.util.ArrayList;

public class Buch {

    private String autor;
    private String titel;
    private int nummer;
    private ArrayList<Buchexemplar> listeVonBuchexemplaren;
    private static int letzteNummer = 0;

    public Buch() {
        inkrementiereLetzteNummer();
        this.nummer = getLetzteNummer();
    }

    public Buch(String autor, String titel) {
        inkrementiereLetzteNummer();
        this.nummer = getLetzteNummer();
        this.autor = autor;
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNummer() {
        return this.nummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public static int getLetzteNummer() {
        return letzteNummer;
    }

    private static void inkrementiereLetzteNummer() {
        letzteNummer++;
    }

    public void exemplarHinzufügen() {
        listeVonBuchexemplaren.add(new Buchexemplar());
    }

    public void exemplarLöschen(int nummer) {
        for (int i = 0; i < listeVonBuchexemplaren.size(); i++) {
            if (listeVonBuchexemplaren.get(i).getNummer() == nummer && !listeVonBuchexemplaren.get(i).istVerliehen()) {
                listeVonBuchexemplaren.remove(i);
                listeVonBuchexemplaren.trimToSize();
            }
        }
    }

    public void exemplarLöschen(Buchexemplar b) {
        if (!b.istVerliehen()) {
            listeVonBuchexemplaren.remove(b);
            listeVonBuchexemplaren.trimToSize();
        }
    }
}
