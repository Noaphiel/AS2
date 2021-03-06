public class Sparkonto extends Konto {

    private double zinssatz;

    public Sparkonto(String iban, Kunde inhaber) {
        super(iban, inhaber);
    }

    public Sparkonto(String iban, Kunde inhaber, double zinsen) {
        super(iban, inhaber);
        this.setZinssatz(zinsen);
    }

    @Override
    public boolean transaktion(double betrag) {
        if ((this.getKontostand() + betrag) <= 0)
            return false;
        else
            this.kontostand += betrag;
        return true;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }
}