import java.time.LocalDate;

public class Lebensmittel extends Artikel {

    private LocalDate mhd;

    public Lebensmittel(String bez, double preis) {

        super(bez, preis);
        this.setMhd(LocalDate.now().plusWeeks(4));

    }

    public LocalDate getMhd() {
        return mhd;
    }

    public void setMhd(LocalDate mhd) {
        this.mhd = mhd;
    }
}