
public class Girokonto extends Konto {

	private double dispo;
	private double dispo_zinssatz;
	
	public Girokonto(String iban, Kunde inhaber) {
		super(iban, inhaber);
		
	}
	
	public Girokonto(String iban, Kunde inhaber, double zinssatz) {
		super(iban, inhaber);
		this.dispo_zinssatz = zinssatz;
	}

	@Override
	public boolean transaktion(double betrag) {
		if ((this.getKontostand() + betrag) < dispo)
			return false;
		else this.kontostand += betrag;
		return true;
	}

	public double getDispo_zinssatz() {
		return dispo_zinssatz;
	}

	public void setDispo_zinssatz(double dispo_zinssatz) {
		this.dispo_zinssatz = dispo_zinssatz;
	}

	public double getDispo() {
		return dispo;
	}

}
