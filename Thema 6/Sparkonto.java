public class Sparkonto extends Konto {

    private double guthabenZinssatz;

    public Sparkonto(String iban, Kunde inhaber) {
        super(iban, inhaber);
    }

    @Override
    public boolean transaktion(double betrag) {
        // TODO Auto-generated method stub
        return false;
    }
}