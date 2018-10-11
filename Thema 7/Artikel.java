
public class Artikel {

    private String bezeichnung;
    private int nummer;
    private double preis;

    public Artikel(String b, double p, int n) {
        this.bezeichnung = b;
        this.preis = p;
        this.nummer = n;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getArtikelnummer() {
        return nummer;
    }

    public double getPreis() {
        return preis;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

}
