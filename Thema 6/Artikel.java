
public class Artikel implements Comparable<Artikel> {
    private String bezeichnung;
    private int artikelnummer;
    private double preis;
    private static int letzteNummer = 0;

    public Artikel(String bez, double preis) {
        this.bezeichnung = bez;
        this.preis = preis;
        this.artikelnummer = Artikel.getLetzteNummer() + 1;
        Artikel.setLetzteNummer(artikelnummer);
    }

    @Override
    public int compareTo(Artikel x) {
        if (this.getArtikelnummer() < x.getArtikelnummer())
            return -1;
        else if (this.getArtikelnummer() == x.getArtikelnummer())
            return 0;
        else
            return 1;
    }

    public static int getLetzteNummer() {
        return letzteNummer;
    }

    public static void setLetzteNummer(int letzteNummer) {
        Artikel.letzteNummer = letzteNummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public double getPreis() {
        return preis;
    }

}
