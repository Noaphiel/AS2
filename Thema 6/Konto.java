
public abstract class Konto implements Comparable<Konto> {

    private String iban;
    protected double kontostand;
    private Kunde inhaber;

    public Konto(String iban, Kunde inhaber) {
        this.iban = iban;
        this.inhaber = inhaber;
    }

    public String getIban() {
        return iban;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public abstract boolean transaktion(double betrag);

    @Override
    public int compareTo(Konto x) {
        return this.getIban().compareTo(x.getIban());
    }

}
