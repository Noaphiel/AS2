import java.time.LocalDate;

public class Lebensmittel extends Artikel {

	private LocalDate mhd;
	
	public Lebensmittel(String bez, double preis) {
		
		super(bez, preis);
		
		this.mhd = LocalDate.now().plusWeeks(4);
	}

	

}
