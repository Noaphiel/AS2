
abstract class Konto implements Comparable<Konto> {

    protected double kontostand;
    private String iban;
    private Kunde inhaber;

    public Konto(String iban, Kunde inhaber) {
        this.iban = iban;
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getIban() {
        return iban;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public abstract boolean transaktion(double betrag);

    @Override
    public int compareTo(Konto a) {
        return this.getIban().compareTo(a.getIban());
    }
}